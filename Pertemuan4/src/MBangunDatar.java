/**
 * File      : MBangunDatar.java
 * Deskripsi : Main program untuk menguji objek Bangun Datar
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("--- PENGUJIAN PERSEGI ---");
        Persegi p = new Persegi(5.0, "Biru", "Putih");
        p.printInfo();

        System.out.println("\n--- PENGUJIAN LINGKARAN ---");
        Lingkaran l = new Lingkaran(10.0, "Hijau", "Hitam");
        l.printInfo();

        System.out.println("\nTotal Objek Bangun Datar: " + BangunDatar.getCounterBangunDatar());
    }
}