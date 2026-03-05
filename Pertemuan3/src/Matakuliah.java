/* Nama File    : Matakuliah.java
 * Deskripsi    : berisi objek implementasi dari class Matakuliah
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 maret 2026
 * Lab          : C1
*/

public class Matakuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private int sks;
    private static int counterMatkul = 0;
    // Konstruktor
    public Matakuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
        counterMatkul++;
    }
    
    public String getIdMatkul() {
        return idMatkul;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
    public static int getCounterMatkul() {
        return counterMatkul;
    }
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
}
