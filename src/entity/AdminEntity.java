package entity;

public class AdminEntity extends LoginEntity{
    private int kode;

    public AdminEntity(String id, String password, String nama, int kode) {
        super(id, password, nama);
        this.kode = kode;
    }

    public AdminEntity(){
        
    }
    public int getKode() {
        return kode;
    }
    public void setKode(int kode) {
        this.kode = kode;
    }
    
}
