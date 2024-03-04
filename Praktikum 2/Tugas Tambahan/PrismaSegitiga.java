/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class PrismaSegitiga {
    private Segitiga alasPrisma;
    private Segitiga tinggiSegitiga;
    private double tinggiPrisma;

    // Konstruktor untuk inisialisasi objek prisma segitiga
    public PrismaSegitiga(Segitiga alas, Segitiga tinggi,  double a) {
        alasPrisma  = alas;
        tinggiSegitiga = tinggi;
        tinggiPrisma = a;
    }

    public void setAlasPrisma(Segitiga alas){
        alasPrisma = alas;
    }

    public void setTinggiSegitiga(Segitiga tinggi){
        tinggiSegitiga = tinggi;
    }

    public void setTinggiPrisma(double a){
        tinggiPrisma = a;
    }
    public Segitiga getAlas() {
        return alasPrisma;
    }

    public Segitiga getTinggiSegitiga() {
        return tinggiSegitiga;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

      // Metode untuk menghitung volume prisma segitiga
      public double hitungVolume() {
        double alas = alasPrisma.getAlas();
        double tinggi = tinggiSegitiga.getTinggiSegitiga();
        double volume = 0.5 * alas * tinggi * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        // Luas permukaan prisma segitiga = Luas alas + Luas sisi tegak
        double alas = alasPrisma.getAlas();
        double tinggi = tinggiSegitiga.getTinggiSegitiga();
        double luasAlas = 0.5 * alas * tinggi;
        double luasSisiTegak = (alas * tinggi) + (3 * alas * tinggi); // 3 adalah jumlah sisi tegak pada segitiga

        return luasAlas + luasSisiTegak;
    }
}