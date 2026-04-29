/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
 */

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor4;

public class Mahasiswa extends Civitasakademika {
    // Attribut
    private String nim;
    private Dosen dosenWali;

    //Method
    public Mahasiswa(String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    public String getNim(){
        return nim;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    @Override
    public String getNomor(){
        return nim;
    }

    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void tampilDataMahasiswa(){
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama         : " + nama);
        System.out.println("  Dosen Wali   : " + getDosenWali().getNama());
    }
}
