/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class MGaris {
    public static void main(String []args) {

        Titik t1 = new Titik (1, 2);
        Titik t2 = new Titik (5,6);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();

        System.out.println("Titik Awal(" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir(" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");
        
        System.out.println("Panjang Garis G = " + G.getPanjang());
        System.out.println("Gradien Garis G = " + G.getGradien());

        Garis GRefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GRefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GRefleksiY.getTitikAkhir();

        System.out.println("Titik Awal(" + tAwalRefleksiY.getAbsis() + ", " + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Awal(" + tAkhirRefleksiY.getAbsis() + ", " + tAkhirRefleksiY.getOrdinat() + ")");

        System.out.println("Garis G tegak lurus dengan garis GRefleksiY = " + G.isTegakLurus(GRefleksiY));

    }

    
}

/* Penggunaan Private / Public menunjukkan akses dari fungsi/atribut tersebut
 * dimana Public berarti dapat digunakan didalam dan diluar class itu sendiri
 * sedangkan Private berarti hanya dapat digunakan didalam class itu sendiri
 * 
 * Misal
 * Jika fungsi getTitikAkhir memiliki akses private, maka dalam class yang berbeda seperti MGaris
 * fungsi setAbsis ini tidak dapat digunakan karena memiliki akses private sehingga hanya bisa digunakan di class Titik
*/