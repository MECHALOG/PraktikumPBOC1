/**
 * File      : BangunDatar.java
 * Deskripsi : Kelas induk untuk kategori objek bangun datar
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 1 April 2026
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() { return this.jmlSisi; }
    public void setJmlSisi(int jmlSisi) { this.jmlSisi = jmlSisi; }

    public String getWarna() { return this.warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public String getBorder() { return this.border; }
    public void setBorder(String border) { this.border = border; }

    public void printInfo() {
        System.out.println("Detail Bangun Datar:");
        System.out.println("> Jumlah Sisi : " + this.jmlSisi);
        System.out.println("> Warna       : " + this.warna);
        System.out.println("> Border      : " + this.border);
    }

    public static int getCounterBangunDatar() { return counterBangunDatar; }
}