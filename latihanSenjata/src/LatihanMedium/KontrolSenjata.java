package LatihanMedium;
import latihanMedium.Senjata;
import java.lang.String;

public class KontrolSenjata extends Senjata {
    public Senjata senjata;
    
   
   public KontrolSenjata(Senjata s) {
        super(String bunyi);
        this.senjata = s;
        this.bunyi = bunyi;
    }
    

    public boolean isAdaPeluru() {
        if(peluru >= 1) {
            return true;
        } 
        else {
            return false;
       }   
    }
    
   public void isiPeluru(int jumPeluru) {
       for (int i = 0; i < jumPeluru; i++) {
           System.out.println (">> Peluru berhasil ditambah: " + jumPeluru);
           
       }
   }
                
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(peluru <= 0) {
            System.out.println("Gagal tembak, Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                System.out.print(getBunyi() + " ");
                peluru = peluru - 1;
            }
        }
    }
    
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang Bayonet";
        }
    }
    
    
}

