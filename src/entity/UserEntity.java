package entity;

public class UserEntity{
    private String nama;
    private String noTelp;
    private String alamat;
    
    public UserEntity(String nama, String noTelp, String alamat){
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    public UserEntity(){
        
    }
   
    public String getNama(){
        return nama;
    }
    
 
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
