/* Ananda Putra Bayu
 * 24060122140125
 * B2
 */

public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
 		// Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

     // To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert(jumlahTiket <= 0): "tidak dapat memesan";
		
            System.out.println("tidak dapat memesan" + jumlahTiket + "tiket");

   	// To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert(jumlahTiket > tiketTersedia): "pemesanan melebihi tiket yang tersedia" ;
            System.out.println("pemesanan " + jumlahTiket + ", melebihi tiket yang tersedia");


   	System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

	public static void isEWallet(int EWallet) {
            
 		// To Do : Memeriksa apakah index e-wallet yang dipilih valid
        if (EWallet <= 4 & EWallet > 0){
            System.out.println("EWallet valid");
        }

		// To Do : Assertion untuk memastikan e-wallet yang dipilih valid
        else {
            assert(EWallet > 4 || EWallet < 0);
            System.out.println("EWallet tidak valid");
        }

     System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		return "OVO";
			case 2:
       		return "GoPay";
			case 3:
       		return "DANA";
			case 4:
       		return "LinkAja";
			default:
       		return "";
		}
	}
}
