package controller;

import entity.UserEntity;
import model.UserModel;
import java.util.ArrayList;

public class UserController {
    public UserModel um = new UserModel();
    
    
    public UserController(){
        
    }
    
    public ArrayList<UserEntity> view(){
        return um.getDataUser();
    }

    public void insert(UserEntity user){
        um.insert(user);
    }

    public void delete(int index){
        um.delete(index);
    }
    
    public int cekUser(String idUser){
        int keterangan = -1;
        if(um.getDataUser().size()>0){
            for(int i=0;i<um.getDataUser().size();i++){
             if(idUser.equals(um.getDataUser().get(i).getNoTelp())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public UserEntity showDaftarUser(int index){
        return um.getDataUser().get(index);
    }

}