// Ananda Putra Bayu
// 24060122140125
// B2

public class Segitiga {
    private double alas;
    private double tinggi;
    
    // Konstruktor untuk inisialisasi objek segitiga
    public Segitiga(double alas, double tinggi) {
          this.alas = alas;
           this.tinggi = tinggi;
    }
    
    // Metode untuk menghitung luas segitiga
     public double getAlas() {
         return alas;
     }
    
     // Metode untuk menghitung keliling segitiga
     public double getTinggiSegitiga() {
        return tinggi;
     }

     // Metode untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
