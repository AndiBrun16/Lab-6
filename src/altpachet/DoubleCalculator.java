
package altpachet;

public class DoubleCalculator extends ACalculator {
    @Override
    public void init(Object initialState) {
        if (initialState instanceof Double) {
            this.state = (Double) initialState;
        } else {
            this.state = 0.0;
        }
    }

    public DoubleCalculator add(double num) {
        if (this.state instanceof Double) {
            this.state = (Double) this.state + num;
        }
        return this;
    }

    public DoubleCalculator subtract(double num) {
        if (this.state instanceof Double) {
            this.state = (Double) this.state - num;
        }
        return this;
    }

    public DoubleCalculator multiply(double num) {
        if (this.state instanceof Double) {
            this.state = (Double) this.state * num;
        }
        return this;
    }
}