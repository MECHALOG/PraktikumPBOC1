/**
 * File      : Persegi.java
 * Deskripsi : Kelas yang mengimplementasikan interface IArea
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */
public class Persegi implements IArea {
    private double sisi; // Variabel untuk menyimpan panjang sisi persegi

    public Persegi(double s) {
        this.sisi = s; // Menginisialisasi sisi dari parameter
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi; // Menghitung luas dengan rumus sisi kali sisi
    }
}