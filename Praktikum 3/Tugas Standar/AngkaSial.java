public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
 * Pertanyaan:
 *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 *
 * Penyelesaian:
 * saat terjadi eksepsi baris 12 tidak akan dieksekusi karena baris 12 hanya akan dieksekusi saat masukkan bukan angka 13
 * 
 * baris 21 akan dieksekusi ketika ditemukana eksepsi (masukkan angka 13) dimana akan memberikan output "jangan memasukkan angka 13 karena angka sial !!"
 * dan "hati-hati memasukkan angka!!!". Jika masukkan bukan angka 13 maka tidak dieksekusi
 */