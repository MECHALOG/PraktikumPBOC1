/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi objek implementasi dari class Kendaraan
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 maret 2026
 * Lab          : C1
*/

public class Kendaraan {
    // Atribut
    private String noPlat;
    private String JenisTipe;

    // Konstruktor
    public Kendaraan(String noPlat, String JenisTipe) {
        this.noPlat = noPlat;
        this.JenisTipe = JenisTipe;
    }
    // Method
    public String getNoPlat() {
        return noPlat;
    }
    public String getJenisTipe() {
        return JenisTipe;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public void setJenisTipe(String JenisTipe) {
        this.JenisTipe = JenisTipe;
    }
}
