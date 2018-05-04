package application;

public class FizzBuzz
{
    private final String f = "Fizz", b = "Buzz", fb = "FizzBuzz";

    public boolean isMultOfThree(int n)
    {
        return n % 3 == 0;
    }

    public boolean isMultOfFive(int n)
    {
        return n % 5 == 0;
    }

    public boolean isMultOfThreeAndFive(int n)
    {
        return n % 3 == 0 && n % 5 == 0;
    }

    public String printNumberOrWord(int n)
    {
        if (isMultOfThreeAndFive(n)) {
            return fb + " ";
        } else if (isMultOfThree(n)) {
            return f + " ";
        } else if (isMultOfFive(n)) {
            return b + " ";
        } else {
            return n + " ";
        }
    }

    public String getF()
    {
        return f;
    }

    public String getB()
    {
        return b;
    }

    public String getFb()
    {
        return fb;
    }
}
