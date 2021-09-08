package solver;

import solver.Matrix.Matrix;

public class MatrixEchelonFormReducer {

    public static void reduceToEchelonForm(Matrix matrix) {
        int sizeOfMatrix = matrix.getRow(0).getCoefficients().length - 1;
        int diagonal = 0;

        for (int col = 0; col < sizeOfMatrix; col++, diagonal++) {
            reduceDiagonalToOne(matrix, diagonal);
            for (int row = 0; row < sizeOfMatrix; row++) {
                if (col == row) {
                    continue;
                } else if (matrix.getRow(row).getCoefficient(col) != 0) {
                    System.out.println("R" + (row + 1) + " add to R" + (diagonal + 1) + " multipled by " + -matrix.getRow(row).getCoefficient(col));
                    reduceCoefficientToZero(matrix.getRow(row).getCoefficients(), matrix.getRow(diagonal).getCoefficients(),
                    matrix.getRow(row).getCoefficient(col));
                }
            }
        }
    }

    private static void reduceDiagonalToOne(Matrix matrix, int diagonalIndex) {
        System.out.println("Reduce diagonal R" + diagonalIndex + " to 1 by division by " + matrix.getRow(diagonalIndex).getCoefficient(diagonalIndex));
        if (matrix.getRow(diagonalIndex).getCoefficient(diagonalIndex) != 1) {
            reduceCoefficientToOne(matrix.getRow(diagonalIndex).getCoefficients(),
                    matrix.getRow(diagonalIndex).getCoefficient(diagonalIndex));

        }
    }

    private static void reduceCoefficientToZero(double[] target, double[] helperRow, double helperValue) {
        helperValue = -helperValue;
        for (int i = 0; i < target.length; i++) {
            target[i] += helperRow[i] * helperValue;
        }
    }

    private static void reduceCoefficientToOne(double[] target, double value) {
        for (int i = 0; i < target.length; i++) {
            target[i] = target[i] / value;
        }
    }


}
