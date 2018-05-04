package test;

import application.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MultOfThreeAndFiveTest
{
    private int n;
    private boolean expect;

    public MultOfThreeAndFiveTest(int n, boolean expect)
    {
        this.n = n;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData()
    {
        return Arrays.asList(new Object[][]{
                {15, true}, {30, true}, {45, true}, {60, true}, {75, true}, {90, true}, {180, true}, {150, true},
                {3, false}, {5, false}, {25, false}, {21, false}, {33, false}, {512, false}, {155, false}
        });
    }

    @Test
    public void testMultOfThreeAndFive()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean result = fizzBuzz.isMultOfThreeAndFive(n);
        Assert.assertEquals(expect, result);
    }
}
