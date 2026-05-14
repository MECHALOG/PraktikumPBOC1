public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data(){
        ruang = (T[]) new Object[100];
        banyak=0;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus antara 1 sampai 100");
        }
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T isi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus antara 1 sampai 100");
        }

        if (ruang[posisi - 1] == null && isi != null) {
            banyak++;
        } else if (ruang[posisi - 1] != null && isi == null) {
            banyak--;
        }

        ruang[posisi - 1] = isi;
    }

    public int getSize() {
        return banyak;
    }   
}
