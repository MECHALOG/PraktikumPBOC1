/**
 * File      : Pegawai.java
 * Deskripsi : Kelas induk Pegawai
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    protected String NIP, nama;
    protected LocalDate tglLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP; this.nama = nama;
        this.tglLahir = tglLahir; this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerja() { return Period.between(this.TMT, LocalDate.now()).getYears(); }

    protected String formatTanggal(LocalDate d) {
        return d.format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")));
    }

    protected String formatRupiah(double n) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(n);
    }

    public void printInfo() {
        System.out.println("NIP          : " + this.NIP);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Masa Kerja   : " + getMasaKerja() + " Thn");
    }
}