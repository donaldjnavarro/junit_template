package com.symflower.demo;

import org.junit.jupiter.api.*;

/**
 * Example Unit Test patterns
 */
public class ExampleTest {

    /**
     * Example method that runs before all tests using a JUnit 5 annotation
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println(".   @BeforeAll was called!");
    }

    /**
     * Example method that runs before each individual test using a JUnit 5 annotation
     */
    @BeforeEach
    public void beforeEach() {
        System.out.println("..  @BeforeEach was called!");
    }

    /**
     * Example method that runs after all tests using a JUnit 5 annotation
     */
    @AfterAll
    public static void afterAll() {
        System.out.println(".   @AfterAll was called!");
    }

    /**
     * Example method that runs after each individual test using a JUnit 5 annotation
     */
    @AfterEach
    public void afterEach() {
        System.out.println("..  @AfterEach was called!");
    }

    /**
     * An example assertion for verifying something is true
     */
    @Test
    public void expectTrue() {
        System.out.println("[ ] Test a true!");
        Assertions.assertTrue(true, "Expect true");
    }

    /**
     * An example assertion for verifying something is false
     */
    @Test
    public void expectFalse() {
        System.out.println("[ ] Test a false!");
        Assertions.assertFalse(false, "Expect false");
    }

    /**
     * An example assertion for comparing 2 values
     */
    @Test
    public void expectMatch() {
        System.out.println("[ ] Test a comparison!");
        int actual = Integer.parseInt("1");
        Assertions.assertEquals(1, actual, "Expect comparison to match");
    }

    // /**
    //  * An example assertion that throws a failure on purpose
    //  */
    // @Test
    // public void failOnDemand() {
    //     Assertions.fail("This test fails on purpose.");
    // }

    /**
     * An example test for verifying a Class method
     */
    @Test
    public void expectClassMethodReturn() {
        System.out.println("[ ] Test a class method!");
        String argument = "Lorem ipsum dolor sit amet";
        String actual = ExampleClass.helloWorld(new String[]{argument});
        String expected = "Hello World: " + argument;
        Assertions.assertEquals(expected, actual, "Test App class's Hello World string");
    }
}
