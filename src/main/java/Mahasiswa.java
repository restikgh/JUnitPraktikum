public class Mahasiswa {
    String nama;
    int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public boolean isLulus() {
        return nilai >= 60;
    }
}