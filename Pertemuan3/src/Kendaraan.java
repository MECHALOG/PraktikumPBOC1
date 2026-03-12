/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi objek implementasi dari class Kendaraan
 * Pembuat      : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal      : 5 Maret 2026
 * Lab          : C1
*/

public class Kendaraan {
    /*** ATRIBUT ***/
    private String noPlat;
    private String jenis;
    private static int countKendaraan = 0;

    /*** KONSTRUKTOR ***/
    public Kendaraan() {
        this("Kosong", "motor");
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;

        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis;
        } else {
            this.jenis = "motor"; // default
        }

        countKendaraan++;
    }

    /*** GETTER ***/
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    /*** SETTER ***/
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis;
        }
    }

    /*** METHOD TAMBAHAN ***/
    public static int getCountKendaraan(){
        return countKendaraan;
    }

    public static void printCountKendaraan(){
        System.out.println("Jumlah Kendaraan : " + getCountKendaraan());
    }

    public void printKendaraan() {
        System.out.println("No Plat : " + noPlat);
        System.out.println("Jenis   : " + jenis);
    }
}