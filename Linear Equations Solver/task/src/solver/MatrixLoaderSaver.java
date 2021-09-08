package solver;

import solver.Matrix.Matrix;
import solver.Matrix.Row;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixLoaderSaver {

    public static Matrix readMatrix(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int numberOfRows = Integer.parseInt(scanner.nextLine().trim());
        int line = 0;
        Matrix matrix = new Matrix(numberOfRows);

        while (scanner.hasNextLine()) {
            matrix.addRow(new Row(
                    Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::valueOf).toArray()),
                    line++
            );
        }
        scanner.close();
        return matrix;
    }

    public static void saveSolution(String nameOfFile, double[] content) {
        try {
            FileWriter fileWriter = new FileWriter(nameOfFile, false);
            Arrays.stream(content)
                    .mapToObj(String::valueOf)
                    .forEach(v -> {
                        try {
                            fileWriter.write(v + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    System.out.println("Saved to file " + nameOfFile);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Saving file " + nameOfFile + " failed!");
            e.printStackTrace();
        }

    }
}
