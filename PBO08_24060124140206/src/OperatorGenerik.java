/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 2 MEI 2026
 */

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing, U extends Kucing> int Bobot2(T k1, U k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
