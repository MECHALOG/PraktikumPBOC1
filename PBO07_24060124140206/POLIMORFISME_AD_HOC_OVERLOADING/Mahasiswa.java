package POLIMORFISME_AD_HOC_OVERLOADING;
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026

public class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mahasiswaLain) {
        this.nim = mahasiswaLain.nim;
        this.nama = mahasiswaLain.nama;
        this.programStudi = mahasiswaLain.programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mahasiswaLain) {
        this.programStudi = mahasiswaLain.programStudi;
    }

    public void tampilkanData(String judul) {
        System.out.println(judul);
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Aplikasi Overloading Method setProgramStudi ===");
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("24060124140206");
        m1.setNama("Aufaarel Nabiil Aryadh Mecca");
        m1.setProgramStudi();
        m1.tampilkanData("Varian 1: setProgramStudi()");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("24060124120006");
        m2.setNama("Aditya Sulthonul Ulya");
        m2.setProgramStudi("Informatika");
        m2.tampilkanData("Varian 2: setProgramStudi(String)");

        Mahasiswa m3 = new Mahasiswa();
        m3.setNim("24060124130053");
        m3.setNama("Abhi");
        m3.setProgramStudi(m2);
        m3.tampilkanData("Varian 3: setProgramStudi(Mahasiswa)");

        System.out.println("=== Aplikasi Overloading Constructor ===");
        Mahasiswa defaultMahasiswa = new Mahasiswa();
        defaultMahasiswa.tampilkanData("Constructor tanpa parameter");

        Mahasiswa parameterMahasiswa =
                new Mahasiswa("24060124120006", "Aditya Sulthonul Ulya", "Teknik Informatika");
        parameterMahasiswa.tampilkanData("Constructor dengan 3 parameter");

        Mahasiswa cloneMahasiswa = new Mahasiswa(parameterMahasiswa);
        cloneMahasiswa.tampilkanData("Constructor cloning dari objek Mahasiswa lain");
    }
}
