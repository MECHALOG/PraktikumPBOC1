/**
 * File      : PNS.java
 * Deskripsi : Representasi PNS sebagai Manusia dan Wajib Pajak
 * Pembuat   : Aufaarel Nabiil Aryadh Mecca - 24060124140206
 * Tanggal   : 3anch April 2026
 */
public class PNS extends Manusia implements IPajak {
    private String NIP; // Atribut unik milik PNS

    public PNS(String n, String t, String a, double p, String nip) {
        super(n, t, a, p); // Mengirim data ke konstruktor kelas Manusia
        this.NIP = nip; // Mengisi Nomor Induk Pegawai
    }

    @Override
    public double hitungPajak() {
        return 0.10 * penghasilan; // Pajak PNS adalah 10 persen dari penghasilan
    }

    @Override
    public void tampilkanData() {
        System.out.println("Jabatan: PNS, Nama: " + nama + ", NIP: " + NIP); // Mencetak data PNS
    }
}