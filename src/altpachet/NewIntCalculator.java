
package altpachet;

public class NewIntCalculator extends ACalculator {
    @Override
    public void init(Object initialState) {
        if (initialState instanceof Integer) {
            this.state = (Integer) initialState;
        } else {
            this.state = 0;
        }
    }

    public NewIntCalculator add(int num) {
        if (this.state instanceof Integer) {
            this.state = (Integer) this.state + num;
        }
        return this;
    }

    public NewIntCalculator subtract(int num) {
        if (this.state instanceof Integer) {
            this.state = (Integer) this.state - num;
        }
        return this;
    }

    public NewIntCalculator multiply(int num) {
        if (this.state instanceof Integer) {
            this.state = (Integer) this.state * num;
        }
        return this;
    }
}