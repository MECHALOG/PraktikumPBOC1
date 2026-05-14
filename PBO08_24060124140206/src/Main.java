/*
// NIM : 24060124140206
// NAMA : Aufaarel Nabiil Aryadh Mecca
// Tanggal : 2 MEI 2026
 */

public class Main {
    public static void main(String[] args) {

        Datum<Anabul> datumKucing1 = new Datum<>(new Anggora("Anggora1", "Abu-abu"));
        Datum<Anabul> datumKucing2 = new Datum<>(new KembangTelon("KembangTelon1", "Coklat"));

        System.out.println("Isi datumKucing1: "+datumKucing1.getIsi().getNama()+" dengan warna rambut "+((Kucing)datumKucing1.getIsi()).getWarnaRambut());
        System.out.println("Isi datumKucing2: "+datumKucing2.getIsi().getNama()+" dengan warna rambut "+((Kucing)datumKucing2.getIsi()).getWarnaRambut());

        datumKucing1.setIsi(new Kucing("Si Manis", "Putih"));
        datumKucing2.setIsi(new Anggora("Si Hitam", "Hitam"));

        System.out.println("Isi datumKucing1 setelah diubah: "+datumKucing1.getIsi().getNama()+" dengan warna rambut "+((Kucing)datumKucing1.getIsi()).getWarnaRambut());
        System.out.println("Isi datumKucing2 setelah diubah: "+datumKucing2.getIsi().getNama()+" dengan warna rambut "+((Kucing)datumKucing2.getIsi()).getWarnaRambut());
        

        OperatorGenerik op = new OperatorGenerik();

        Datum<Integer> x = new Datum<>(3);
        Datum<Integer> y = new Datum<>(6);
        System.out.println("x,y sebelum ditukar:");
        System.out.println(x.getIsi());
        System.out.println(y.getIsi());

        op.Tukar(x, y);
        System.out.println("x,y setelah ditukar:");
        System.out.println(x.getIsi());
        System.out.println(y.getIsi());


        Datum<String> s1 = new Datum<>("apel");
        Datum<String> s2 = new Datum<>("jeruk");
        System.out.println("String s1,s2 sebelum ditukar:");
        System.out.println(s1.getIsi());
        System.out.println(s2.getIsi());

        op.Tukar(s1, s2);
        System.out.println("String s1,s2 setelah ditukar:");
        System.out.println(s1.getIsi());
        System.out.println(s2.getIsi());


        Datum<Anabul> h1 = new Datum<>(new Anjing("Buddy", "Bulldog"));
        Datum<Anabul> h2 = new Datum<>(new Kucing("Kitty", "Putih"));
        System.out.println("Hewan h1,h2 sebelum ditukar:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());

        op.Tukar(h1, h2);
        System.out.println("Hewan h1,h2 setelah ditukar:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());

        Anggora a = new Anggora("Milo", "Putih");
        KembangTelon k = new KembangTelon("Belang", "Coklat");

        a.setBobot(4);
        k.setBobot(5);
        System.out.println("Bobot Milo: " +a.getBobot());
        System.out.println("Bobot Belang: " +k.getBobot());
        System.out.println("Bobot Milo dan Belang: " +op.Bobot2(a, k));

        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Anggora("Oyen", "Jingga"));
        dataAnabul.setIsi(2, new Anjing("Doggy", "Poodle"));
        dataAnabul.setIsi(3, new Burung("Rio", "Biru"));

        System.out.println("Banyak elemen efektif dataAnabul: " + dataAnabul.getSize());
        System.out.println("Isi dataAnabul posisi 1: " + dataAnabul.getIsi(1).getNama());
        System.out.println("Isi dataAnabul posisi 2: " + dataAnabul.getIsi(2).getNama());
        System.out.println("Isi dataAnabul posisi 3: " + dataAnabul.getIsi(3).getNama());

        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            dataAnabul.getIsi(i).Gerak();
            dataAnabul.getIsi(i).Bersuara();
        }
    }
}
