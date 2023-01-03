package controller;

import entity.AdminEntity;
import model.AdminModel;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminController {
    public AdminModel am = new AdminModel();
    Scanner input = new Scanner(System.in);
    
    public AdminController(){
        
    }
    
    public ArrayList<AdminEntity> view(){
        return am.getDataAdmin();
    }
    
    //method untuk insert admin
    public void insert(AdminEntity admin){
        am.insert(admin);
    }
    
    public void update(int index, AdminEntity admin){
        am.update(index, admin);
    }
    public void delete(int index){
        am.delete(index);
    }
    
    public void dataAdmin(){
        String user     [] = {"Admin1","Admin2","Admin3"};
        String password [] = {"6803","2806","1123"};
        String nama     [] = {"Naasa","Kholid","Dzikri"};
        int kode        [] = {1,2,3};
        
        for(int i=0; i<user.length; i++){
            am.insert(new AdminEntity(user[i],password[i],nama[i], kode[i]));
        }
    }
}