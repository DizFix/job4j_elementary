package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        short inx1 = 0;
        short inx2 = 2;
        short iny1 = 0;
        short iny2 = 0;
        double expected = 2;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}