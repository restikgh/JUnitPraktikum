public class BankAccount {
    int saldo = 0;

    public void deposit(int jumlah) {
        saldo += jumlah;
    }

    public void withdraw(int jumlah) {
        if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak cukup");
        }
        saldo -= jumlah;
    }

    public int getSaldo() {
        return saldo;
    }
}