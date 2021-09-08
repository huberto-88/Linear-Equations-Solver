package solver.Matrix;

public class Matrix {
    private Row[] rows;

    public Matrix(int numberOfRows) {
        rows = new Row[numberOfRows];
    }

    public void addRow(Row row, int i) {
        this.rows[i] = row;
    }

    public Row getRow(int index) {
        return rows[index];
    }

    public double[] getLastCoefficients() {
        double[] lastCoefficients = new double[rows.length];
        for (int i = 0; i < rows.length; i++) {
            lastCoefficients[i] = getRow(i).getLastCoefficient();
        }
        return lastCoefficients;
    }

    public void printMatrix() {
        for (Row row : rows) {
            System.out.println(row.toString());
        }
    }
}
