/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi program utama untuk menjalankan class
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 Maret 2026
 * Lab          : C1
*/

public class MMahasiswa {
    public static void main(String[] args) {

        /*** MATA KULIAH ***/
        System.out.println("------------ MATA KULIAH ------------");

        MataKuliah ASA = new MataKuliah("MIK1624404", "Analisis dan Strategi Algoritma", 3);
        ASA.printMatkul();

        MataKuliah IMK = new MataKuliah("MIK1624603", "Interaksi Manusia dan Komputer", 3);
        IMK.printMatkul();

        MataKuliah Alpro = new MataKuliah("MIK1624202", "Algoritma Pemrograman", 4);
        Alpro.printMatkul();

        System.out.println(" ");
        System.out.println("Total Mata Kuliah: " + MataKuliah.getCounterMatkul());
        System.out.println(" ");

        /*** DOSEN ***/
        System.out.println("------------ DOSEN ------------");

        Dosen D1 = new Dosen("24060124120026", "Prabowo", "Ilmu Nyawit");
        D1.printDosen();
        System.out.println(" ");

        Dosen D2 = new Dosen("24060124120004", "Jokowi", "Ilmu Nganggur");
        D2.printDosen();
        System.out.println(" ");

        System.out.println("Total Dosen: " + Dosen.getCountDosen());
        System.out.println(" ");

        /*** KENDARAAN ***/
        System.out.println("------------ KENDARAAN ------------");

        Kendaraan K1 = new Kendaraan("H 4974 TH", "Mobil");
        K1.printKendaraan();
        System.out.println(" ");

        Kendaraan K2 = new Kendaraan("H 8105 U", "Motor");
        K2.printKendaraan();
        System.out.println(" ");

        System.out.println("Total Kendaraan: " + Kendaraan.getCountKendaraan());
        System.out.println(" ");

        /*** MAHASISWA ***/
        System.out.println("------------ MAHASISWA ------------");

        Mahasiswa M1 = new Mahasiswa("24060124140206", "Aufaarel Nabiil Aryadh Mecca", "Informatika");
        M1.addMatkul(Alpro);
        M1.addMatkul(ASA);
        M1.addMatkul(IMK);
        M1.setDosen(D1);
        M1.setKendaraan(K1);
        M1.printDetailMhs();
        System.out.println(" ");

        Mahasiswa M2 = new Mahasiswa("24060124120004", "Farras Hilmy Zaidan", "Informatika");
        M2.addMatkul(Alpro);
        M2.addMatkul(ASA);
        M2.setDosen(D2);
        M2.setKendaraan(K2);
        M2.printDetailMhs();
        System.out.println(" ");

        System.out.println("Total Mahasiswa: " + Mahasiswa.getJmlMhs());
    }
}