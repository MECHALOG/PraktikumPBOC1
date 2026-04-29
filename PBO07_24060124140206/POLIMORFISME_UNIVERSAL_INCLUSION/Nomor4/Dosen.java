/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
 */

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor4;

public class Dosen extends Civitasakademika {
    // Attribut
    private String nip;

    //Method
    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }    

    public String getNip(){
        return nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }
}
