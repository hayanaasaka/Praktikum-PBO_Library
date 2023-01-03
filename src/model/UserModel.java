package model;

import entity.UserEntity;
import java.util.ArrayList;

public class UserModel implements ModelInterfaces {
    private ArrayList<UserEntity> DataUser;
    
    public UserModel(){
        DataUser = new ArrayList<>();
    }
    
    public ArrayList<UserEntity> getDataUser(){
        return DataUser;
    }
    
    @Override
    public void view(){
        
    }
    
    @Override
    public void insert(Object x){
        DataUser.add((UserEntity) x);
    }
    
    @Override
    public void update(int index, Object x){
        DataUser.set(index, (UserEntity) x);
    }
    
    @Override
    public void delete(int index){
        DataUser.remove(index);
    }
    
    @Override
    public void get_where(int index){
        DataUser.get(index);
    }
}
