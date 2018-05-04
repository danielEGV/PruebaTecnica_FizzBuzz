package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        MultOfThreeTest.class,
        MultOfFiveTest.class,
        MultOfThreeAndFiveTest.class,
        PrintNumberOrWordTest.class
})
public class FizzBuzzTestSuite { }
