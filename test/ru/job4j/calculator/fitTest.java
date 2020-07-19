package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class fitTest {

    @Test
    public void manWeighttest () {
        double heigth = 187;
        double expected = 100;
        double out = fit.manWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeighttest () {
        double heigth = 187;
        double expected = 100;
        double out = fit.womanWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }
}