package controller;

import entity.UserEntity;
import model.UserModel;
import java.util.ArrayList;
import view.*;
import javax.swing.table.DefaultTableModel;

public class UserController {
    public UserModel um = new UserModel();
    
    
    public UserController(){
        
    }
    
    public ArrayList<UserEntity> view(){
        return um.getDataUser();
    }

    public void insert(String nama, String noTelp, String alamat){
          UserEntity user = new UserEntity();
            user.setNama(nama);
            user.setNoTelp(noTelp);
            user.setAlamat(alamat);
            um.insert(user);
    }

    public void delete(int index){
        um.delete(index);
    }
    
     public DefaultTableModel listuser(){
        DefaultTableModel datalistuser = new DefaultTableModel();
        Object[] kolom = {"Nama","No Telepon","Alamat"};
        datalistuser.setColumnIdentifiers(kolom);
        
        int size = allobjcontroller.uc.view().size();
         for (int i=0; i<size; i++){
             Object [] data = new Object[3];
                data[0] = allobjcontroller.uc.view().get(i).getNama();
                data[1] = allobjcontroller.uc.view().get(i).getNoTelp();
                data[2] = allobjcontroller.uc.view().get(i).getAlamat();

                datalistuser.addRow(data);

         }
            return datalistuser;
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