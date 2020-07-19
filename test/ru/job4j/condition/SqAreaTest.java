package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        short in1 = 4;
        short in2 = 1;
        double expected = 1;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}