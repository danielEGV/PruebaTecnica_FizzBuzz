package test;

import application.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class MultOfFiveTest
{
    private int n;
    private boolean expect;

    public MultOfFiveTest(int n, boolean expect)
    {
        this.n = n;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData()
    {
        return Arrays.asList(new Object[][]{
                {5, true}, {15, true}, {30, true}, {45, true}, {70, true}, {85, true}, {90, true}, {95, true}, {100, true}, {260, true}, {125, true},
                {23, false}, {92, false}, {3, false}, {333, false}, {77, false}, {21, false}
        });
    }

    @Test
    public void testMultOfFive()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        boolean result = fizzBuzz.isMultOfFive(n);
        Assert.assertEquals(expect, result);
    }
}
