//Nama: Ananda Putra Bayu
//Nim: 24060122140125
//Lab: B2

public class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        // Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().Gerak(); // Output: ulat merayap

        anu.setIsi(new Kepompong());
        anu.getIsi().Gerak(); // Output: kepompong diam

        anu.setIsi(new KupuDewasa());
        anu.getIsi().Gerak(); // Output: kupu terbang
    }
}