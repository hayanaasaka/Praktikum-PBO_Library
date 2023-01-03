package model;

import entity.AdminEntity;
import java.util.ArrayList;
        
public class AdminModel implements ModelInterfaces{
   private ArrayList<AdminEntity> DataAdmin;
    
    public AdminModel(){
        DataAdmin = new ArrayList<>();
    }
    
    public ArrayList<AdminEntity> getDataAdmin(){
        return DataAdmin;
    }
    
    @Override
    public void view(){
        
    }
    
    @Override
    public void insert(Object x){
        DataAdmin.add((AdminEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataAdmin.set(index, (AdminEntity) x);
    }
    
    @Override
    public void delete(int index){
        DataAdmin.remove(index);
    }
    
    @Override
    public void get_where(int index){
        DataAdmin.get(index);
    }
}
