package solver;

import solver.Matrix.Matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String inputPath = args[1];
//        String outputPath = args[3];
        String inputPath = "in.txt";
        String outputPath = "out.txt";
        Matrix matrix = MatrixLoaderSaver.readMatrix(new File(inputPath));

        MatrixEchelonFormReducer.reduceToEchelonForm(matrix);

        System.out.println("The solution is: " + Arrays.toString(matrix.getLastCoefficients()));
        MatrixLoaderSaver.saveSolution(outputPath, matrix.getLastCoefficients());
        matrix.printMatrix();
    }
}
