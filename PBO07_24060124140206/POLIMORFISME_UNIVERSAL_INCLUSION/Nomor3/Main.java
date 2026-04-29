/*  
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.Nomor3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Kitty", "Putih");
        Anjing anjing1 = new Anjing("Buddy", "Golden Retriever");
        Burung burung1 = new Burung("Tweety", "Kuning");

        // Array polimorfik Anabul
        Anabul[] hewan = {kucing1, anjing1, burung1};

        // Panggil method secara polimorfik
        for (Anabul h : hewan) {
            h.Gerak();
            h.Bersuara();
        }
    }
}
