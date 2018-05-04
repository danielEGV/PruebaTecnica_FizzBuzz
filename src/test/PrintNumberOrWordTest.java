package test;

import application.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class PrintNumberOrWordTest
{
    private int n;
    private String expect;
    private final static String f = "Fizz ", b = "Buzz ", fb = "FizzBuzz ";

    public PrintNumberOrWordTest(int n, String expect)
    {
        this.n = n;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData()
    {
        return Arrays.asList(new Object[][]{
                {3, f}, {5, b}, {15, fb}, {25, b}, {30, fb}, {27, f}, {150, fb}, {455, b}, {273, f}, {18, f},
                {35, b}, {45, fb}, {105, fb}, {9, f}, {16, "16 "}, {44, "44 "}, {343, "343 "}, {64, "64 "}
        });
    }

    @Test
    public void testPrintNumberOrWord()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.printNumberOrWord(n);
        Assert.assertEquals(expect, result);
    }
}
