/* Nama File    : Dosen.java
 * Deskripsi    : berisi objek implementasi dari class Dosen
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 Maret 2026
 * Lab          : C1
*/

public class Dosen {
    /*** ATRIBUT ***/
    private String nip;      // Nomor Induk Pegawai
    private String nama;     // Nama Dosen
    private String prodi;    // Program Studi
    private static int countDosen = 0; // Menghitung jumlah objek Dosen

    /*** KONSTRUKTOR ***/
    public Dosen() {
        this("0", "Default", "Belum");
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        countDosen++; 
    }

    /*** SELEKTOR (GETTER) ***/
    public String getNIP(){ 
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    /*** MUTATOR (SETTER) ***/
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIP(String nip){ 
        this.nip = nip;
    }

    public void setProdi(String prodi){ 
        this.prodi = prodi;
    }

    /*** METHOD TAMBAHAN ***/
    // Menghitung jumlah dosen
    public static int getCountDosen(){
        return countDosen;
    }

    // Menampilkan jumlah dosen
    public static void printCountDosen(){
        System.out.println("Jumlah Dosen : " + getCountDosen());
    }

    // Menampilkan data dosen
    public void printDosen(){
        System.out.println("NIP = " + nip + ", Nama = " + nama + ", Prodi = " + prodi);
    }
}