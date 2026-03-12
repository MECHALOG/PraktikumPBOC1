// Nama File    : Mahasiswa.java
// Deskripsi    : berisi objek implementasi dari class Mahasiswa
// Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
// Tanggal      : 5 Maret 2026
// Lab          : C1

import java.util.ArrayList;

public class Mahasiswa {
    /*** ATRIBUT ***/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int countMahasiswa = 0;

    /*** KONSTRUKTOR ***/
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        countMahasiswa++;
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        countMahasiswa++;
    }

    /*** SELEKTOR ***/
    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for(int i = 0; i < listMatkul.size(); i++){
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    /*** MUTATOR ***/
    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void addMatkul(MataKuliah newMatkul){
        if (listMatkul.size() < 50){
            listMatkul.add(newMatkul);
        }
    }

    public void setDosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*** METHOD TAMBAHAN ***/
    public void printMhs(){
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);

        System.out.println("List Mata Kuliah :");
        for (int i = 0; i < listMatkul.size(); i++){
            System.out.println("   " + (i+1) + ". " 
            + listMatkul.get(i).getNamaMatkul() 
            + " (" + listMatkul.get(i).getSks() + " SKS)");
        }

        System.out.println("Total SKS : " + getJumlahSKS());
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali  : " + dosenWali.getNIP());
        System.out.println("No Plat Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan   : " + kendaraan.getJenis());
    }

    public static int getJmlMhs(){
        return countMahasiswa;
    }

    public static void printJmlMhs(){
        System.out.println("Jumlah Mahasiswa : " + getJmlMhs());
    }
}