/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class Titik {
    private  double absis;
    private double ordinat;
    private static double counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double b){
        ordinat = b;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static double getcounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}

/* Penggunaan Private / Public menunjukkan akses dari fungsi/atribut tersebut
 * dimana Public berarti dapat digunakan didalam dan diluar class itu sendiri
 * sedangkan Private berarti hanya dapat digunakan didalam class itu sendiri
 * 
 * Misal
 * Jika fungsi getAbsis memiliki akses private, maka dalam class yang berbeda seperti MTitik
 * fungsi setAbsis ini tidak dapat digunakan karena memiliki akses private sehingga hanya bisa digunakan di class Titik
*/
