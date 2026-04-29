/**
 * File      : Manusia.java
 * Deskripsi : Kelas abstrak Manusia untuk studi kasus pajak
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 3 April 2026
 */
public abstract class Manusia {
    protected String nama, tglLahir, alamat; // Atribut identitas dasar manusia
    protected double penghasilan; // Atribut nilai pendapatan
    protected static int counterMns = 0; // Menghitung total seluruh objek Manusia

    public Manusia(String n, String t, String a, double p) {
        this.nama = n; // Mengisi nama dari parameter
        this.tglLahir = t; // Mengisi tanggal lahir
        this.alamat = a; // Mengisi alamat
        this.penghasilan = p; // Mengisi jumlah penghasilan
        counterMns++; // Menambah jumlah manusia setiap objek dibuat
    }

    public abstract void tampilkanData(); // Metode abstrak untuk menampilkan profil unik

    public void setAlamat(String a) {
        this.alamat = a; // Mengubah alamat manusia
    }
}