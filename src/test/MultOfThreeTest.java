package test;

import application.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MultOfThreeTest
{
    private int n;
    private boolean expect;

    public MultOfThreeTest(int n, boolean expect)
    {
        this.n = n;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData()
    {
        return Arrays.asList(new Object[][]{
                {3, true}, {12, true}, {33, true}, {15, true}, {63, true}, {132, true}, {75, true}, {87, true},
                {14, false}, {61, false}, {125, false}, {283, false}, {8, false}, {23, false}, {98, false}
        });
    }

    @Test
    public void testMultOfThree()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean result = fizzBuzz.isMultOfThree(n);
        Assert.assertEquals(expect, result);
    }
}
