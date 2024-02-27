/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir){
        titikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getPanjang(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return ordinat / absis;
    }

    public Garis getRefleksiY(){
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public boolean isTegakLurus(Garis G){
        return getGradien() * G.getGradien() == -1;
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
