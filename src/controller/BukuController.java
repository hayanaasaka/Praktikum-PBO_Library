package controller;

import entity.BukuEntity;
import model.BukuModel;
import java.util.ArrayList;

public class BukuController {
    public BukuModel bm = new BukuModel();
    
    public BukuController(){
        
    }
    
    public ArrayList<BukuEntity> view(){
        return bm.getDataBuku();
    }
    
    public void insert(BukuEntity buku){
        bm.insert(buku);
    }
    
    public void update(int index, BukuEntity buku){
        bm.update(index, buku);
    }
    
    public void delete(int index){
        bm.delete(index);
    }
    
    public int cekBuku(String idBuku){
        int keterangan = -1;
        if(bm.getDataBuku().size()>0){
          for(int i=0;i<bm.getDataBuku().size();i++){
              if(idBuku.equals(bm.getDataBuku().get(i).getKodeBuku())){
                  keterangan = i;
                  break;
              }else{
                  keterangan = -1;
              }
          }  
        }
        return keterangan;
    }
    
    public BukuEntity showDaftarBuku(int index){
        return bm.getDataBuku().get(index);
    }
}
