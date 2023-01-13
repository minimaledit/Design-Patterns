abstract class Factorial {
    public long calculate(int n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}