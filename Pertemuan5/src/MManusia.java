/**
 * File      : MManusia.java
 * Deskripsi : Driver program untuk menguji sistem pajak Manusia
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 3 April 2026
 */
public class MManusia {
    public static void main(String[] args) {
        PNS p = new PNS("Atang", "05-05-1980", "Jl. Seroja", 15000000, "198302032006041002"); // Membuat objek PNS
        Pengusaha pe = new Pengusaha("Burjo", "01-01-2000", "Jl. Air", 55000000, "2000-556-773"); // Membuat objek Pengusaha
        Petani pt = new Petani("Nugraha", "09-01-1977", "Wonogiri", 5000000, "Wonogiri"); // Membuat objek Petani

        p.tampilkanData(); // Memanggil tampilan data PNS
        System.out.println("Pajak: " + p.hitungPajak()); // Menampilkan pajak PNS

        pe.tampilkanData(); // Memanggil tampilan data Pengusaha
        System.out.println("Pajak: " + pe.hitungPajak()); // Menampilkan pajak Pengusaha

        pt.tampilkanData(); // Memanggil tampilan data Petani
        System.out.println("Pajak: " + pt.hitungPajak()); // Menampilkan pajak Petani

        System.out.println("Total Manusia: " + Manusia.counterMns); // Menampilkan total objek yang terbentuk
    }
}