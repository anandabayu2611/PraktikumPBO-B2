package bukuNonFiksi;

import buku.Buku;


public class bukuNonFiksi extends Buku {
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return subjek;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        System.out.println("Buku Non Fiksi dengan: \nJudul: " + this.judul + "\nPenulis: " + this.penulis + "\ntahunTerbit: " + this.tahunTerbit + "\nSubjek: " + this.subjek + "\nJumlah Halaman: " + this.jumlahHalaman + "\nHarga: " + this.harga);
    }
}
