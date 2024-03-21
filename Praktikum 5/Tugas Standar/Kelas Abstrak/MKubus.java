import java.util.Scanner;

class MKubus {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Kubus k  = new Kubus();
            System.out.print("Masukkan sisi bujur sangkar : ");
            double sisi = scan.nextDouble();
            System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + k.hitungLuas(sisi));
        }
    }
}