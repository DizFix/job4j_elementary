package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class fitTest {

    @Test
    public void manWeighttest () {
        short heigth = 187;
        double expected = 100.05;
        double out = fit.manWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeighttest () {
        short heigth = 187;
        double expected = 88.55;
        double out = fit.womanWeight(heigth);
        Assert.assertEquals(expected, out, 0.01);
    }
}