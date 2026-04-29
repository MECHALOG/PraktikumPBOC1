/**
 * File      : Tendik.java
 * Deskripsi : Tenaga Kependidikan (BUP 55)
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate getTglPensiun() { return this.tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1); }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang       : " + this.bidang);
        System.out.println("Pensiun      : " + formatTanggal(getTglPensiun()));
    }
}