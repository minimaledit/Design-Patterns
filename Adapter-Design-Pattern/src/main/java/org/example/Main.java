package org.example;

interface TemperatureSensor {
    double getTemperature();
}

class CelsiusTemperatureSensor implements TemperatureSensor {
    @Override
    public double getTemperature() {
        double x = 20; // example
        return x;
    }
}

class TemperatureAdapter implements TemperatureSensor {
    private CelsiusTemperatureSensor sensor;

    public TemperatureAdapter(CelsiusTemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        double celsius = sensor.getTemperature();
        return (celsius * 9/5) + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}