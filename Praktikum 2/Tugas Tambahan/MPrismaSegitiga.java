/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class MPrismaSegitiga {
     public static void main(String []args) {

        Segitiga s1 = new Segitiga(3, 4);
        PrismaSegitiga p1 = new PrismaSegitiga(s1, s1, 5);

        System.out.println("Volume Prisma = " + p1.hitungVolume());
        System.out.println("Luas Permukaan Prisma = " + p1.hitungLuasPermukaan());
     }
}
