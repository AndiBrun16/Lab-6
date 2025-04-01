

class IntCalculator {
    protected int state;

    public IntCalculator(int initialState) {
        this.state = initialState;
    }

    public IntCalculator add(int num) {
        this.state += num;
        return this;
    }

    public IntCalculator subtract(int num) {
        this.state -= num;
        return this;
    }

    public IntCalculator multiply(int num) {
        this.state *= num;
        return this;
    }

    public int result() {
        return this.state;
    }

    public void clear() {
        this.state = 0;
    }
}