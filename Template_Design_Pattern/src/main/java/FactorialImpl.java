class FactorialImpl extends Factorial {
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return super.calculate(n);
    }
}