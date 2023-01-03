package entity;
import java.util.Date;

public class PeminjamanEntity {
    private UserEntity User;
    private BukuEntity buku;
    private Date tglPinjam, tglKembali;

    public PeminjamanEntity(UserEntity User, BukuEntity buku, Date tglPinjam, Date tglKembali) {
        this.User = User;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public UserEntity getUser() {
        return User;
    }

    public void setUser(UserEntity User) {
        this.User = User;
    }

    public BukuEntity getBuku() {
        return buku;
    }

    public void setBuku(BukuEntity buku) {
        this.buku = buku;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }
    
}