import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        assertEquals(100, acc.getSaldo());
    }

    @Test
    void testWithdrawBerhasil() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        acc.withdraw(50);
        assertEquals(50, acc.getSaldo());
    }

    @Test
    void testWithdrawGagal() {
        BankAccount acc = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(50);
        });
    }
}