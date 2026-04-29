/**
 * File      : Persegi.java
 * Deskripsi : Representasi objek Persegi (Turunan BangunDatar)
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;
    private static int counterPersegi = 0;

    public Persegi() {
        super();
        this.jmlSisi = 4;
        counterPersegi++;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        counterPersegi++;
    }

    public double getSisi() { return this.sisi; }
    public void setSisi(double s) { this.sisi = s; }

    public double getLuas() { return this.sisi * this.sisi; }
    public double getKeliling() { return 4 * this.sisi; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("> Panjang Sisi: " + this.sisi);
        System.out.println("> Luas        : " + this.getLuas());
        System.out.println("> Keliling    : " + this.getKeliling());
    }

    public static int getCounterPersegi() { return counterPersegi; }
}