import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ParamTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testGenap(int angka) {
        assertTrue(angka % 2 == 0);
    }
}