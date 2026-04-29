/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
 */

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor4;

abstract class Civitasakademika {
    protected String nama;    

    public Civitasakademika(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public abstract String getNomor();
}
