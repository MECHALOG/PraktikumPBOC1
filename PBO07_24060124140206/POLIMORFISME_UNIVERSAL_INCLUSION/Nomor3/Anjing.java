/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor3;

public class Anjing extends Anabul{
    // Attribut
    private String ras;
    
    // Method
    public Anjing(String nama, String ras){
        super(nama);
        this.ras = ras;
    }
    
    public String getRas(){
        return ras;
    }

    @Override 
    public void Gerak(){
        System.out.println(getNama()+" bergerak dengan cara: Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama()+" bersuara: Guk Guk");
    }
}
