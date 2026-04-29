import org.junit.jupiter.api.*;

public class LifecycleTest {

    @BeforeEach
    void setUp() {
        System.out.println("Sebelum test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Setelah test");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }
}