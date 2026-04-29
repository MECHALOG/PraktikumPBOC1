/**
 * File      : DosenTetap.java
 * Deskripsi : Turunan Dosen dengan status tetap (BUP 65)
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public double getTunjangan() { return 0.02 * getMasaKerja() * this.gajiPokok; }

    public LocalDate getTglPensiun() { return this.tglLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1); }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN         : " + this.NIDN);
        System.out.println("Pensiun      : " + formatTanggal(getTglPensiun()));
        System.out.println("Tunjangan    : " + formatRupiah(getTunjangan()));
    }
}