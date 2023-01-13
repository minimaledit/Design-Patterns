package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureAdapterTest {
    TemperatureAdapter adapter;

    @BeforeEach
    public void setUp() {
        CelsiusTemperatureSensor sensor = new CelsiusTemperatureSensor();
        adapter = new TemperatureAdapter(sensor);
    }

    @Test
    public void testGetTemperature() {
        double expected = (20 * 9/5) + 32; // example - 20
        double actual = adapter.getTemperature();
        assertEquals(expected, actual, 0.1);
    }
}