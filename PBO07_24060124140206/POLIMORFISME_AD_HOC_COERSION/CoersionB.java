package POLIMORFISME_AD_HOC_COERSION;
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026

public class CoersionB {
    public static void main(String[] args) {
        // Atribut
        int nilaiINT = 65;
        double nilaiREAL = (double) nilaiINT;
        int backToINT = (int) nilaiREAL;

        // Method
        System.out.println("Nilai real : " + nilaiREAL);
        System.out.println("Nilai integer : " + backToINT);
    }
}
