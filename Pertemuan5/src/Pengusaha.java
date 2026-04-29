/**
 * File      : Pengusaha.java
 * Deskripsi : Representasi Pengusaha sebagai Manusia dan Wajib Pajak
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 3 April 2026
 */
public class Pengusaha extends Manusia implements IPajak {
    private String NoIzin; // Atribut unik nomor izin usaha

    public Pengusaha(String n, String t, String a, double p, String i) {
        super(n, t, a, p); // Mengirim data ke konstruktor kelas Manusia
        this.NoIzin = i; // Mengisi nomor izin usaha
    }

    @Override
    public double hitungPajak() {
        return 0.25 * penghasilan; // Pajak Pengusaha adalah 25 persen dari penghasilan
    }

    @Override
    public void tampilkanData() {
        System.out.println("Jabatan: Pengusaha, Nama: " + nama + ", Izin: " + NoIzin); // Mencetak data Pengusaha
    }
}