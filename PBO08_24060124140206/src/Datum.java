/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 2 MEI 2026
 */


public class Datum<T> {
    private T isi;

    public Datum(T isi){
        this.isi = isi;
    }

    public T getIsi(){
        return isi;
    }

    public void setIsi(T isi){
        this.isi = isi;
    }
}
