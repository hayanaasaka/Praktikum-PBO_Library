package entity;

public class BukuEntity {
    private String judulBuku,penulis,penerbit,kodeBuku;
    private int tahunTerbit, jumlahBuku;

    public BukuEntity(String judulBuku, String penulis, String penerbit, String kodeBuku, int tahunTerbit, int jumlahBuku) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kodeBuku = kodeBuku;
        this.tahunTerbit = tahunTerbit;
        this.jumlahBuku = jumlahBuku;
    }

    public BukuEntity(){
        
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
    
    public BukuEntity(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    
}
