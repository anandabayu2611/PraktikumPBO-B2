class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Pertanyaan: 
 * mengapa secara konsep masih kurang tepat?
 * 
 * Penyelesaian:
 * seharusnya ada tambahan seperti if(jariJari > 0) output jari jari = ...
 * lalu tambahkan else dimana ada assert(jariJari>0) output "jari jari tidak boleh nol!!!"
 */