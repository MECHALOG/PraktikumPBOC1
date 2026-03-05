/* Nama File    : Dosen.java
 * Deskripsi    : berisi objek implementasi dari class Dosen
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 maret 2026
 * Lab          : C1
*/

public class Dosen {
    // Atribut
    private String NIP;
    private String nama;
    private String prodi;
    private static int counterDosen = 0;
    // Konstruktor
    public Dosen(String nama, String NIP, String prodi) {
        this.nama = nama;
        this.NIP = NIP;
        this.prodi = prodi;
        counterDosen++;
    }
    // Method
    public String getNIP() {
        return NIP;
    }   
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public static int getCounterDosen() {
        return counterDosen;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }   
    public void setNama(String nama) {
        this.nama = nama;
    }   
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
