

class AdvancedCalculator extends IntCalculator {
    public AdvancedCalculator(int initialState) {
        super(initialState);
    }

    public AdvancedCalculator divide(double num) {
        this.state = (int) (this.state / num);
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        int temp = 1;
        for (int i = 0; i < exponent; i++) {
            temp *= this.state;
        }
        this.state = temp;
        return this;
    }

    public AdvancedCalculator root(int n) {
        this.state = (int) Math.pow(this.state, 1.0 / n);
        return this;
    }

    @Override
    public AdvancedCalculator add(int num) {
        super.add(num);
        return this;
    }

    @Override
    public AdvancedCalculator subtract(int num) {
        super.subtract(num);
        return this;
    }

    @Override
    public AdvancedCalculator multiply(int num) {
        super.multiply(num);
        return this;
    }
}