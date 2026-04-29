/**
 * File      : Petani.java
 * Deskripsi : Representasi Petani sebagai Manusia dan Wajib Pajak
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 3 April 2026
 */
public class Petani extends Manusia implements IPajak {
    private String lokasi; // Atribut unik lokasi lahan tani

    public Petani(String n, String t, String a, double p, String l) {
        super(n, t, a, p); // Mengirim data ke konstruktor kelas Manusia
        this.lokasi = l; // Mengisi lokasi lahan tani
    }

    @Override
    public double hitungPajak() {
        return 0.05 * penghasilan; // Pajak Petani adalah 5 persen dari penghasilan
    }

    @Override
    public void tampilkanData() {
        System.out.println("Jabatan: Petani, Nama: " + nama + ", Lahan: " + lokasi); // Mencetak data Petani
    }
}