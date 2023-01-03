package model;

import entity.PeminjamanEntity;
import java.util.ArrayList;

public class PeminjamanModel {
    private ArrayList<PeminjamanEntity> DataPeminjaman;
    
    public PeminjamanModel(){
        DataPeminjaman = new ArrayList<>();
    }
    
    public ArrayList<PeminjamanEntity> getDataPeminjaman(){
        return DataPeminjaman;
    }
    
    public void insertDataPeminjaman(PeminjamanEntity peminjam){
        DataPeminjaman.add(peminjam);
    }
}
