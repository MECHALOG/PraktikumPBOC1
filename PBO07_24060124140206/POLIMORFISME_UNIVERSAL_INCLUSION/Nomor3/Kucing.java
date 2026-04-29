/*  
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor3;

class Kucing extends Anabul {
    private String warnaRambut;

    public Kucing(String nama, String warnaRambut) {
        super(nama);
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan cara: Melata di tanah ");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: Meeow");
    }
}
