/**
 * File      : MPegawai.java
 * Deskripsi : Main program untuk menguji sistem kepegawaian
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap d1 = new DosenTetap("123", "Andi", LocalDate.of(1980, 5, 5), LocalDate.of(2010, 1, 1), 5000000, "FSM", "789");
        d1.printInfo();
        
        System.out.println();
        Tendik t1 = new Tendik("456", "Budi", LocalDate.of(1990, 1, 1), LocalDate.of(2015, 1, 1), 3000000, "Keuangan");
        t1.printInfo();
    }
}