/**
 * File      : Dosen.java
 * Deskripsi : Turunan Pegawai khusus untuk Dosen
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() { return fakultas; }
}