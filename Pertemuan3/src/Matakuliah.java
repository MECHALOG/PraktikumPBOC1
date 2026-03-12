/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi objek implementasi dari class MataKuliah
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 Maret 2026
 * Lab          : C1
*/

public class MataKuliah {
    // =============== ATRIBUT ===============
    private String idMatkul;
    private String namaMatkul;
    private int sks;
    private static int counterMatkul = 0;
    
    // =============== KONSTRUKTOR ===============
    /**
     * Konstruktor dengan parameter
     * Menginisialisasi ID mata kuliah, nama, dan SKS
     */
    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        counterMatkul++;
    }
    
    // =============== SELEKTOR (GETTER) ===============
    /**
     * Mengembalikan ID mata kuliah
     */
    public String getIdMatkul() {
        return idMatkul;
    }
    
    /**
     * Mengembalikan nama mata kuliah
     */
    public String getNamaMatkul() {
        return namaMatkul;
    }
    
    /**
     * Mengembalikan jumlah SKS mata kuliah
     */
    public int getSks() {
        return sks;
    }
    
    /**
     * Mengembalikan jumlah total mata kuliah yang telah dibuat
     */
    public static int getCounterMatkul() {
        return counterMatkul;
    }
    
    // =============== MUTATOR (SETTER) ===============
    /**
     * Mengubah ID mata kuliah
     */
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    
    /**
     * Mengubah nama mata kuliah
     */
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    
    /**
     * Mengubah jumlah SKS mata kuliah
     */
    public void setSks(int sks) {
        this.sks = sks;
    }
    
    // =============== METHOD ===============
    /**
     * Menampilkan informasi mata kuliah
     */
    public void printMatkul() {
        System.out.println("ID Mata Kuliah : " + idMatkul);
        System.out.println("Nama           : " + namaMatkul);
        System.out.println("SKS            : " + sks);
    }
}