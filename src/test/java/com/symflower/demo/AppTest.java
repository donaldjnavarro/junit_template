package com.symflower.demo;

import static org.junit.jupiter.api.Assertions.*;
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
    public void shouldAnswerWithTrue() {
        System.out.println("First test!");
        Assertions.assertTrue(true);
    }

    /**
     * Another example test
     */
    @Test
    public void shouldAnswerWithFalse() {
        System.out.println("Second test!");
        Assertions.assertFalse(false);
    }
}
