class FactorialSequence {
    private Factorial factorial;

    public FactorialSequence(Factorial factorial) {
        this.factorial = factorial;
    }

    public long[] calculate(int n) {
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = factorial.calculate(i);
        }
        return result;
    }
}