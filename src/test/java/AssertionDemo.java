import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionDemo {

    @Test
    public void basic() {
        assertEquals(1 + 1, 2);
        assertEquals(1 + 1, 2, ()-> "message");
        assertFalse(1 > 2);
        assertTrue(1 < 2);
        assertNull(null);
        assertNotNull(this);
        assertSame("foo", "foo");
        assertArrayEquals(new int[] {1, 2, 3}, new int[] {1, 2, 3});
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }
};