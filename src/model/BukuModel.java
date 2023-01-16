package model;

import entity.BukuEntity;
import java.util.ArrayList;

public class BukuModel implements ModelInterfaces {
    private ArrayList<BukuEntity> DataBuku;
    
    public BukuModel(){
        DataBuku = new ArrayList<>();
    }
    
    public ArrayList<BukuEntity> getDataBuku(){
        return DataBuku;
    }
    
    public void view(){
        
    }
    
    public void insert(Object x){
        DataBuku.add((BukuEntity) x);
    }
    
    public void update(int index, Object x){
        DataBuku.set(index,(BukuEntity) x);
    }
    
    public void delete(int index){
        DataBuku.remove(index);
    }
    
    @Override
    public void get_where(int index){
        DataBuku.get(index);
    }
}
