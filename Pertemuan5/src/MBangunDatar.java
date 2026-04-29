/**
 * File      : MBangunDatar.java
 * Deskripsi : Driver program untuk menguji Abstract Class dan Interface
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */
public class MBangunDatar {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7, "Biru", "Putus-putus"); // Membuat objek Lingkaran baru
        l.printInfo(); // Menampilkan atribut lingkaran
        System.out.println("Luas Lingkaran: " + l.getLuas()); // Menampilkan hasil perhitungan luas

        Persegi p = new Persegi(10); // Membuat objek Persegi melalui interface
        System.out.println("Luas Persegi: " + p.hitungLuas()); // Menampilkan hasil luas persegi
    }
}