/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi objek implementasi dari class Mahasiswa
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 maret 2026
 * Lab          : C1
*/

public class Mahasiswa {
    // Atribut
    private String NIM;
    private String nama;
    private String prodi;
    Arraylist<Matakuliah> listMatkul ;
    private static int counterMahasiswa = 0;
    // Konstruktor
    public Mahasiswa(String nama, String NIM, String prodi) {
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        counterMahasiswa++;
    }
    // Method
    public String getNIM() {
        return NIM;
    }   
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }   
    public void setNama(String nama) {
        this.nama = nama;
    }   
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }    
}
