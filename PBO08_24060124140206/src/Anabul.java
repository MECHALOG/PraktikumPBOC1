/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 2 MEI 2026
 */

abstract class Anabul {
    // Atribut
    private String nama;

    // Method
    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}
