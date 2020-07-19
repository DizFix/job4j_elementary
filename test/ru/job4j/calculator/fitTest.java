package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class fitTest {

    @Test
    public static double manWeight(double height) {
        double heigth = 187;
        double expected = 100;
        double out = fit.manWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public static double womanWeight(double height) {
        double heigth = 187;
        double expected = 100;
        double out = fit.womanWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }
}