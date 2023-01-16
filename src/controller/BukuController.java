package controller;

import entity.BukuEntity;
import model.BukuModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.allobjcontroller;

public class BukuController {
    public BukuModel bm = new BukuModel();
    
    public BukuController(){
        
    }
    
    public ArrayList<BukuEntity> view(){
        return bm.getDataBuku();
    }
    
    public void insert(String judulBuku,String penulis,String penerbit,String kodeBuku,int tahunTerbit,int jumlahBuku){
    BukuEntity buku = new BukuEntity();
        buku.setJudulBuku(judulBuku);
        buku.setPenulis(penulis);
        buku.setPenerbit(penerbit);
        buku.setKodeBuku(kodeBuku);
        buku.setTahunTerbit(tahunTerbit);
        buku.setJumlahBuku(jumlahBuku);
        bm.insert(buku);
    }
    
    public void update(int index, String judulBuku,String penulis,String penerbit,String kodeBuku,int tahunTerbit,int jumlahBuku){
        BukuEntity buku = new BukuEntity();
        buku.setJudulBuku(judulBuku);
        buku.setPenulis(penulis);
        buku.setPenerbit(penerbit);
        buku.setKodeBuku(kodeBuku);
        buku.setTahunTerbit(tahunTerbit);
        buku.setJumlahBuku(jumlahBuku);
        bm.update(index,buku);
    }
    
    
    public void delete(int index){
        bm.delete(index);
    }
    
    public DefaultTableModel listbuku(){
        DefaultTableModel datalistbuku = new DefaultTableModel();
        Object[] kolom ={"JudulBuku","Penulis", "Penerbit","KodeBuku","TahunTerbit","JumlahBuku"};
        datalistbuku.setColumnIdentifiers(kolom);
        int size = allobjcontroller.bc.view().size();
        for(int i=0; i < size; i++){
            Object[] buku = new Object[6];
            buku[0] = allobjcontroller.bc.view().get(i).getJudulBuku();
            buku[1] = allobjcontroller.bc.view().get(i).getPenulis();
            buku[2] = allobjcontroller.bc.view().get(i).getPenerbit();
            buku[3] = allobjcontroller.bc.view().get(i).getKodeBuku();
            buku[4] = allobjcontroller.bc.view().get(i).getTahunTerbit();
            buku[5] = allobjcontroller.bc.view().get(i).getJumlahBuku();
            datalistbuku.addRow(buku);
        }
        return datalistbuku;
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