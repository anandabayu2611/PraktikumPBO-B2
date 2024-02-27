/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */


public class MTitik {
    public static void main(String []args) {
        
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(5,6);

        System.out.println("jumlah objek titik = " + Titik.getcounterTitik());

        // Mengambil nilai titik t1,t2,t3
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        // getJarakPusat
        System.out.println("Jarak pusat ke t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ") adalah " + t1.getJarakPusat());
       
        // RefleksiX
        t1.refleksiX();
        System.out.println("refleksiX t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        t2.refleksiX();
        System.out.println("refleksiX t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        
        t3.refleksiX();
        System.out.println("refleksiX t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        // RefleksiY
        t1.refleksiY();
        System.out.println("refleksiY t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        t2.refleksiY();
        System.out.println("refleksiY t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        
        t3.refleksiY();
        System.out.println("refleksiY t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        // getRefleksiX
        Titik t4 = t1.getRefleksiX();
        System.out.println("Titik baru t4(" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");

        Titik t5 = t2.getRefleksiX();
        System.out.println("Titik baru t5(" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");

        Titik t6 = t3.getRefleksiX();
        System.out.println("Titik baru t6(" + t6.getAbsis() + ", " + t6.getOrdinat() + ")");


        // getRefleksiY
        Titik t7 = t1.getRefleksiY();
        System.out.println("Titik baru t7(" + t7.getAbsis() + ", " + t7.getOrdinat() + ")");

        Titik t8 = t2.getRefleksiY();
        System.out.println("Titik baru t8(" + t8.getAbsis() + ", " + t8.getOrdinat() + ")");

        Titik t9 = t3.getRefleksiY();
        System.out.println("Titik baru t9(" + t9.getAbsis() + ", " + t9.getOrdinat() + ")");
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
