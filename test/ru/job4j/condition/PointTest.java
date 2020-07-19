package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class PointTest {

    @Test
    public void distance() {
        double inx1 = 0;
        double inx2 = 2;
        double iny1 = 0;
        double iny2 = 0;
        double expected = 5;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}