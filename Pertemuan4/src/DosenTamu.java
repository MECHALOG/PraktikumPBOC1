/**
 * File      : DosenTamu.java
 * Deskripsi : Turunan Dosen dengan status tamu
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tglAkhirKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK         : " + this.NIDK);
        System.out.println("Akhir Kontrak: " + formatTanggal(this.tglAkhirKontrak));
    }
}