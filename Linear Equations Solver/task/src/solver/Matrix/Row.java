package solver.Matrix;

import java.util.Arrays;

public class Row {
    double[] coefficients;

    public Row(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double getCoefficient(int index) {
        return coefficients[index];
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double getLastCoefficient() {
        return getCoefficient(coefficients.length - 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(coefficients);
    }
}
