package entity;

public abstract class LoginEntity {
   protected String id;
   protected String password;
   protected String nama;

    public LoginEntity(String id,String password,String nama) {
        this.id = id;
        this.password = password;
        this.nama = nama;
    }

    public LoginEntity(){
        
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
