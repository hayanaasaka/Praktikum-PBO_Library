package main;

import entity.*;
import controller.*;
import view.*;
import java.util.Scanner;

public class Main {
//    Scanner input = new Scanner(System.in);
//    public AdminController admin = new AdminController();
//    public BukuController buku = new BukuController();
//    public UserController user = new UserController();
//    
    public static void main(String[] args) {
        LoginGUI login_g = new LoginGUI();
//      AdminGUI admin = new AdminGUI();
    }
    
//    Scanner input1 = new Scanner(System.in);
//    Main main = new Main();
//    main.admin.dataAdmin();
//        System.out.println(" << SELAMAT DATANG DI PERPUSTAKAAN >> ");
//        int pil;
//        do{
//            System.out.println("\n"
//            +"1. Login Admin"+"\n"
//            +"0. Exit"+"\n"
//            +"Pilih : ");
//            pil = input1.nextInt();
//        
//            switch(pil){
//                case 1:
//                System.out.print("ID = ");
//                String id = input1.next();
//                System.out.print("Password = ");
//                String password = input1.next();
//                main.login(id,password); 
//            }
//            
//        }while(pil != 0);
//    }
//   
//    void login(String id, String password){
//        boolean cekLogin = false;
//        int i;
//        for(i=0;i<admin.am.getDataAdmin().size();i++){
//            //mengecek pass & id
//         try{
//         if(id.equals(admin.am.getDataAdmin().get(i).getId()) && 
//                 password.equals(admin.am.getDataAdmin().get(i).getPassword())){
//             cekLogin = true;
//             break;
//         }
//         }catch(Exception e){
//             cekLogin = false;
//        }  
//    }
//        
//        if(cekLogin){
//            System.out.println("\n"+"Hallo "+admin.am.getDataAdmin().get(i).
//                    getNama()+" Selamat Datang di Perpustakaan!!");
//            menuUtama();
//        }else{
//            System.out.println("Maaf Password atau ID SALAH!!");
//        }
//    }
//    
//    //===== MENU UTAMA =====
//    void menuUtama(){
//        int pilih;
//        do{
//            System.out.println("\n"
//            +" == MENU UTAMA == "+"\n"
//            +" 1. Data Buku"+"\n"
//            +" 2. Data User"+"\n"
//            +" 3. Data Peminjaman"+"\n"
//            +" Pilih : ");
//            pilih = input.nextInt();
//            
//            switch(pilih){
//                case 1:
//                    menuBuku();
//                    break;
//                case 2:
//                    menuUser();
//                    break;
//                case 3:
//                    menuPeminjaman();
//                    break;
//            }
//        }while(pilih !=0);
//    }
//    
//    //===== MENU BUKU =====
//    void menuBuku(){
//        int pilihan;
//        do{
//           System.out.println("\n"
//            +" == MENU Buku == "+"\n"
//            +" 1. Tambah Buku"+"\n"
//            +" 2. Lihat Buku"+"\n"
//            +" 3. Update Buku"+"\n"
//            +" 4. Hapus Buku"+"\n"
//            +" 0. Keluar"+"\n"
//            +" Pilih : ");
//            pilihan = input.nextInt();
//            
//            switch(pilihan){
//                case 1:
//                    insert();
//                    break;
//                case 2:
//                    view();
//                    break;
//                case 3:
//                    update();
//                    break;
//                case 4:
//                    delete();
//                    break;
//            }
//        }while(pilihan !=0);
//    }
//    void insert() {
//        
//        System.out.println("Masukkan Judul Buku : ");
//        String judulBuku = input.next();
//        
//        System.out.println("Masukkan Nama Penulis : ");
//        String penulis = input.next();
//        
//        System.out.println("Masukkan Nama Penerbit : ");
//        String penerbit = input.next();
//        
//        System.out.println("Masukkan Kode Buku :  ");
//        String kodeBuku = input.next();
//        
//        System.out.println("Masukkan Tahun Terbit Buku : ");
//        int tahunTerbit = input.nextInt();
//        
//        System.out.println("Jumlah Buku : ");
//        int jumlahBuku = input.nextInt();
//        
//        buku.insert(judulBuku, penulis, penerbit, kodeBuku, tahunTerbit, jumlahBuku);
//        System.out.println("Data Buku Berhasil Disimpan !!\n");
//    }
//    
//    void view(){
//        if(buku.bm.getDataBuku().size()>0){
//            int noUrut = 0;
//            for (int i = 0; i < buku.bm.getDataBuku().size(); i++) {
//                noUrut++;
//                System.out.println("\n"
//                +"[BUKU " + noUrut + "]"+"\n"
//                +"Kode Buku      : "+buku.bm.getDataBuku().get(i).getKodeBuku()+"\n"
//                +"Judul Buku     : "+buku.bm.getDataBuku().get(i).getJudulBuku()+"\n"
//                +"Penulis Buku   : "+buku.bm.getDataBuku().get(i).getPenulis()+"\n"
//                +"Penerbit Buku  : "+buku.bm.getDataBuku().get(i).getPenerbit()+"\n"
//                +"Tahun Terbit   : "+buku.bm.getDataBuku().get(i).getTahunTerbit()+"\n"
//                +"Jumlah Stok    : "+buku.bm.getDataBuku().get(i).getJumlahBuku());
//            }
//        }else{
//            System.out.println("Data Buku Kosong!!");
//        }
//    }
//    
//    void update() {
//        if(buku.bm.getDataBuku().size()>0){
//            for (int i = 0; i < buku.bm.getDataBuku().size(); i++) {
//                System.out.println("["+i+"] "+buku.bm.getDataBuku().get(i).getJudulBuku());
//            }
//             
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//                        
//            System.out.println("Masukkan Kode Buku : ");
//            String kodeBuku = input.next();
//
//            System.out.println("Masukkan Judul : ");
//            String judulBuku = input.next();
//
//            System.out.println("Masukkan Penulis : ");
//            String penulis = input.next();
//            
//            System.out.println("Masukkan Penerbit : ");
//            String penerbit = input.next();
//
//            System.out.println("Masukkan Tahun Terbit : ");
//            int tahunTerbit = input.nextInt();
//            
//            System.out.println("Jumlah Buku : ");
//            int jumlahBuku = input.nextInt();
//
//            buku.update(selectIndex,judulBuku, penulis, penerbit, kodeBuku, tahunTerbit, jumlahBuku);
//            System.out.println("Data Buku Berhasil Diubah !!\n");
//        }else{
//            System.out.println("Data Buku Kosong\n");
//        }
//    }
//    
//    void delete() {
//        if(buku.bm.getDataBuku().size()>0){
//            for (int i = 0; i < buku.bm.getDataBuku().size(); i++) {
//                System.out.println("["+i+"] "+buku.bm.getDataBuku().get(i).getJudulBuku());
//            }
//            
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//            
//            buku.bm.getDataBuku().remove(selectIndex);
//            System.out.print("Data Buku Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Buku Kosong\n");
//        }
//    }
//    
//    //===== MENU USER=====
//    void menuUser(){
//        int pilihan;
//        do{
//            System.out.println("\n"
//            +" == MENU USER == "+"\n"
//            +" 1. Tambah User"+"\n"
//            +" 2. Lihat User"+"\n"
//            +" 3. Hapus User"+"\n"
//            +" 0. Keluar"+"\n"
//            +" Pilih : ");
//            pilihan = input.nextInt();
//            switch(pilihan){
//                case 1 :
//                        insertUser();
//                        break;
//                case 2 :
//                        viewUser();
//                        break;
//                case 3 :
//                        deleteUser();
//                        break;
//            }
//        }while(pilihan!=0);
//    }
//    
//    void insertUser(){
//        System.out.println("Masukkan Nama : ");
//        String nama = input.next();
//        
//        System.out.println("Masukkan Alamat : ");
//        String alamat = input.next();
//        
//        System.out.println("Masukkan No Telepon : ");
//        String noTelp = input.next();
//               
//        user.insert(new UserEntity(nama, alamat, noTelp));
//        System.out.println("Data User Berhasil Disimpan !! \n");
//    }
//    
//    void viewUser(){
//        if(user.um.getDataUser().size()>0){
//            int noUrut = 0; 
//            for (int i = 0; i<user.um.getDataUser().size(); i++){
//                noUrut++;
//            System.out.println("\n"
//            +"[User "+noUrut +"]" +"\n"
//            +"Nama      :"+user.um.getDataUser().get(i).getNama() + "\n"
//            +"No Telpon :"+user.um.getDataUser().get(i).getNoTelp()+ "\n"
//            +"Alamat    :"+user.um.getDataUser().get(i).getAlamat()+ "\n");
//            }
//     }else{
//             System.out.println("Data Kosong !!");
//      }
//    }
//   
//    void deleteUser(){
//        if(user.um.getDataUser().size()>0){
//            for(int i = 0; i < user.um.getDataUser().size(); i++){
//                System.out.println("["+i+"] "+user.um.getDataUser().get(i).getNama()); 
//            }
//            
//            System.out.println("Pilih Index Nama : ");
//            int selectIndex = input.nextInt();
//            
//            user.um.getDataUser().remove(selectIndex);
//            System.out.println("Data User Berhasil Dihapus !! \n");
//        }else{
//            System.out.println("Data Anggota Kosong \n");
//        }
//    }  
}