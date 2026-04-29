/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
 */

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor3;

public class Burung extends Anabul {
    // Attribut
    private String warnaBulu;

    // Method
    public Burung(String nama, String warnaBulu) {
        super(nama);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan cara: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: Cuit Cuit");
    }
}
