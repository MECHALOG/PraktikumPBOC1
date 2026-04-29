/**
 * File      : BangunDatar.java
 * Deskripsi : Kelas abstrak yang mendefinisikan metode getLuas dan getKeliling
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */
public abstract class BangunDatar {
    protected int jmlSisi; // Menyimpan jumlah sisi bangun datar
    protected String warna; // Menyimpan warna bangun datar
    protected String border; // Menyimpan jenis garis tepi
    protected static int counterBangunDatar = 0; // Menghitung total objek BangunDatar yang dibuat

    public BangunDatar() {
        counterBangunDatar++; // Menambah hitungan setiap kali objek dibuat
    }

    public abstract double getLuas(); // Metode abstrak untuk menghitung luas
    public abstract double getKeliling(); // Metode abstrak untuk menghitung keliling

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi); // Menampilkan jumlah sisi ke layar
        System.out.println("Warna: " + warna); // Menampilkan warna ke layar
        System.out.println("Border: " + border); // Menampilkan jenis border ke layar
    }
}