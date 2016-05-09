package bme.hu.carinfo.unittests;

import bme.hu.carinfo.model.sugarorm.Car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        String name = "lala";
        Car p = new Car();
        assertEquals(p.getName().equals(name), true);
    }
}