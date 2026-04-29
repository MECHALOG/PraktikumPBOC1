/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
 */

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor4;

public class Main {
    public static void main(String[] args) {
        // Buat dosen
        Dosen dosen1 = new Dosen("Dr. Aris Setiawan", "NIP19850312");
        Dosen dosen2 = new Dosen("Luh Putu Eka, Ph.D.", "NIP19771104");

        // Buat mahasiswa dengan dosen wali
        Mahasiswa mhs1 = new Mahasiswa("Rizky Ramadhan", "24060124140001", dosen1);
        Mahasiswa mhs2 = new Mahasiswa("Siti Fatimah", "24060124140002", dosen1);
        Mahasiswa mhs3 = new Mahasiswa("Fajar Nugroho", "24060124140003", dosen2);

        // Buat seminar
        Seminar seminar = new Seminar();

        // Registrasi peserta (polimorfisme - semua tipe Civitasakademika)
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);

        // Tampilkan peserta (demonstrasi polimorfisme getNama() dan getNomor())
        System.out.println("=== DAFTAR PESERTA SEMINAR ===");
        seminar.tampilPeserta();

        // Tampilkan statistik
        System.out.println("\nJumlah total peserta: " + seminar.countPeserta());
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // Tampilkan detail salah satu mahasiswa
        System.out.println("\n=== DETAIL MAHASISWA ===");
        mhs1.tampilDataMahasiswa();
    }
}
