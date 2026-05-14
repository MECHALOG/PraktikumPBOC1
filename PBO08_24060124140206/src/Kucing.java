/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 2 MEI 2026
 */

class Kucing extends Anabul {
    private String warnaRambut;
    private int bobot;

    public Kucing(String nama, String warnaRambut) {
        super(nama);
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
    }

    public void setWarnaRambut(String warnaRambut) {
        this.warnaRambut = warnaRambut;
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
