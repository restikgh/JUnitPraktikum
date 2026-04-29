import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MahasiswaTest {

    @Test
    void testLulus() {
        Mahasiswa m = new Mahasiswa("Res", 80);
        assertTrue(m.isLulus());
    }

    @Test
    void testTidakLulus() {
        Mahasiswa m = new Mahasiswa("Res", 50);
        assertFalse(m.isLulus());
    }
}