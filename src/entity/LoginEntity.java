package entity;

public abstract class LoginEntity {
   protected String user;
   protected String password;
   protected String nama;

    public LoginEntity(String user,String password,String nama) {
        this.user = user;
        this.password = password;
        this.nama = nama;
    }

    public LoginEntity(){
        
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
