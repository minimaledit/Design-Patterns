class CalculatorFacade {
    private Calculator calculator;

    public CalculatorFacade() {
        calculator = new Calculator();
    }

    public double add(double a, double b) {
        return calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        return calculator.subtract(a, b);
    }

    public double multiply(double a, double b) {
        return calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        return calculator.divide(a, b);
    }
}
