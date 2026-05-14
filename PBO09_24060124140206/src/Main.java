/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 14 MEI 2026
 */

public class Main {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Alberttt");
        teman.addNama("Vyn");
        teman.addNama("Ikhsan");
        teman.addNama("Kairi");
        
        System.out.println("Daftar Teman:");
        teman.showTeman();
        System.out.println("\nApakah Alberttt adalah teman anda? " + (teman.isMember("Alberttt")? "Ya":"Tidak"));
        
        teman.gantiNama("Ikhsan", "Lemon");
        System.out.println("\nDaftar Teman setelah mengganti nama Ikhsan menjadi Lemon :");
        teman.showTeman();
        
        teman.delNama("Kairi");
        System.out.println("\nDaftar Teman setelah fight sama Kairi:");
        teman.showTeman();
        
        System.out.println("\nJumlah nama Alberttt: " + teman.countNama("Alberttt"));
    }
}