import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testTambah() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.tambah(2, 3));
    }

    @Test
    void testBagi() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.bagi(4, 2));
    }
    
    @Test
    void testBagiDenganNol() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calc.bagi(4, 0);
        });
    }
}