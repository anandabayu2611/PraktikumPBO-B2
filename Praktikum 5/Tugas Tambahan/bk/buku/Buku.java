package buku;

public class Buku {
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public String getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void view(){
        System.out.println("penulis dengan/n Judul: " + this.judul + "/nJudul: " + this.judul + "/ntahunTerbit: " + this.tahunTerbit);
    }

}



    
