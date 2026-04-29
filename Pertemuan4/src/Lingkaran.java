/**
 * File      : Lingkaran.java
 * Deskripsi : Representasi objek Lingkaran (Turunan BangunDatar)
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;
    private static int counterLingkaran = 0;

    public Lingkaran() {
        super();
        this.setJmlSisi(1);
        counterLingkaran++;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }

    public double getJari() { return this.jari; }
    public void setJari(double r) { this.jari = r; }

    public double getLuas() { return Math.PI * this.jari * this.jari; }
    public double getKeliling() { return 2 * Math.PI * this.jari; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("> Jari-jari   : " + this.jari);
        System.out.println("> Luas        : " + this.getLuas());
        System.out.println("> Keliling    : " + this.getKeliling());
    }

    public static int getCounterLingkaran() { return counterLingkaran; }
}