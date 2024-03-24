package bukuFiksi;

import buku.Buku;


public class bukuFiksi extends Buku {
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;
    
    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return genre;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setSubjek(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        System.out.println("Buku Fiksi dengan:\nJudul: " + this.judul + "\nPenulis: " + this.penulis + "\ntahunTerbit: " + this.tahunTerbit + "\nGenre: " + this.genre + "\nJumlah Halaman: " + this.jumlahHalaman + "\nHarga: " + this.harga + "\n");
    }
 }
    

