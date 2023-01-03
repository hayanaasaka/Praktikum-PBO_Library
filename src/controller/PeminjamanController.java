package controller;

import entity.PeminjamanEntity;
import model.PeminjamanModel;
import java.util.ArrayList;

public class PeminjamanController {
    PeminjamanModel pm = new PeminjamanModel();
    
    public PeminjamanController(){
        
}
    
    public ArrayList<PeminjamanEntity> view(){
        return pm.getDataPeminjaman();
    }
}
