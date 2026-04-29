/**
 * File      : Lingkaran.java
 * Deskripsi : Implementasi nyata dari abstract class BangunDatar
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */
import static java.lang.Math.PI; // Mengambil nilai konstanta PI dari kelas Math

public class Lingkaran extends BangunDatar {
    private double jejari; // Variabel khusus untuk jari-jari lingkaran

    public Lingkaran(double r, String w, String b) {
        this.jmlSisi = 1; // Lingkaran didefinisikan memiliki 1 sisi lengkung
        this.warna = w; // Menginisialisasi warna dari parameter
        this.border = b; // Menginisialisasi border dari parameter
        this.jejari = r; // Menginisialisasi jari-jari dari parameter
    }

    @Override
    public double getLuas() {
        return PI * jejari * jejari; // Menghitung luas dengan rumus PI * r * r
    }

    @Override
    public double getKeliling() {
        return 2 * PI * jejari; // Menghitung keliling dengan rumus 2 * PI * r
    }
}