package com.symflower.demo;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll was called!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach was called!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll was called!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach was called!");
    }

    /**
     * An example test
     */
    @Test
    public void expectTrue() {
        System.out.println("First test!");
        Assertions.assertTrue(true, "Expect true");
    }

    /**
     * Another example test
     */
    @Test
    public void expectFalse() {
        System.out.println("Second test!");
        Assertions.assertFalse(false, "Expect false");
    }

    @Test
    public void expectMatch() {
        System.out.println("Third test!");
        int actual = Integer.parseInt("1");
        Assertions.assertEquals(1, actual, "Expect comparison to match");
    }

    // @Test
    // public void failOnDemand() {
    //     Assertions.fail("This test fails on purpose.");
    // }

    @Test
    public void expectClassMethodReturn() {
        String argument = "Lorem ipsum dolor sit amet";
        String actual = App.helloWorld(new String[]{argument});
        String expected = "Hello World: " + argument;
        Assertions.assertEquals(expected, actual, "Test App class's Hello World string");
    }
}
