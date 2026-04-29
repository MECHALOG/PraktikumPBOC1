package POLIMORFISME_AD_HOC_COERSION;
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 25 April 2026

public class CoersionC {
    protected static String X = "1234";
    protected static String Y = "5678";
    protected static String S = X + Y;

    public static void main(String[] args) {
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        // Method
        System.out.println("String : " + S);
        System.out.println("Integer : " + Z);
    }
}
