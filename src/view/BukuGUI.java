package view;

import controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

public class BukuGUI {
    private static BukuController bc = new BukuController();
    JFrame Buku = new JFrame();
    JLabel top,tambahbuku,labeljudulBuku,labelpenulis,labelpenerbit,labelkodeBuku,labeltahunTerbit,labeljumlahBuku;
    JTextField textjudulBuku,textpenulis,textpenerbit,textkodeBuku,texttahunTerbit,textjumlahBuku;
    JButton btntambahbuku,btnupdatebuku,btnhapusbuku,btnback;
    JTable tabelbuku = new JTable();
    JScrollPane scrollbuku = new JScrollPane(tabelbuku);
    int index;
    
    public BukuGUI(){
        Buku.setSize(900,700);
        Buku.setLayout(null);
        Buku.getContentPane().setBackground(Color.WHITE);
        
        top = new JLabel("Data Buku");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Buku.add(top);
        
        scrollbuku.setBounds(300,180,600,270);
        tabelbuku.setModel(bc.listbuku());
        Buku.add(scrollbuku);
        
        labeljudulBuku = new JLabel("Judul Buku");
        labeljudulBuku.setBounds(30,150,100,30);
        Buku.add(labeljudulBuku);
        
        textjudulBuku = new JTextField();
        textjudulBuku.setBounds(30,180,200,30);
        Buku.add(textjudulBuku);
        
        labelpenulis = new JLabel("Penulis");
        labelpenulis.setBounds(30,210,100,30);
        Buku.add(labelpenulis);
        
        textpenulis = new JTextField();
        textpenulis.setBounds(30,240,200,30);
        Buku.add(textpenulis);
        
        labelpenerbit = new JLabel("Penerbit");
        labelpenerbit.setBounds(30,270,100,30);
        Buku.add(labelpenerbit);
        
        textpenerbit = new JTextField();
        textpenerbit.setBounds(30,300,200,30);
        Buku.add(textpenerbit);
        
        labelkodeBuku = new JLabel("Kode Buku");
        labelkodeBuku.setBounds(30,330,100,30);
        Buku.add(labelkodeBuku);
        
        textkodeBuku = new JTextField();
        textkodeBuku.setBounds(30,360,200,30);
        Buku.add(textkodeBuku);
        
        labeltahunTerbit = new JLabel("Tahun Terbit");
        labeltahunTerbit.setBounds(30,390,100,30);
        Buku.add(labeltahunTerbit);
        
        texttahunTerbit = new JTextField();
        texttahunTerbit.setBounds(30,420,200,30);
        Buku.add(texttahunTerbit);
        
        labeljumlahBuku = new JLabel("Jumlah Buku");
        labeljumlahBuku.setBounds(30,320,100,300);
        Buku.add(labeljumlahBuku);
        
        textjumlahBuku = new JTextField();
        textjumlahBuku.setBounds(30,490,200,30);
        Buku.add(textjumlahBuku);
        
        btntambahbuku = new JButton("Tambah Buku");
        btntambahbuku.setBounds(50,580,150,30);
        Buku.add(btntambahbuku);
        
        btnupdatebuku = new JButton("Update Buku");
        btnupdatebuku.setBounds(50,620,150,30);
        Buku.add(btnupdatebuku);
        
        btnhapusbuku = new JButton("Hapus Buku");
        btnhapusbuku.setBounds(50,660,150,30);
        Buku.add(btnhapusbuku);
        
        btnback = new JButton("Back");
        btnback.setBounds(50,700,150,30);
        btnback.setBackground(Color.red);
        Buku.add(btnback);
        
        Buku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Buku.setVisible(true);
        Buku.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Buku.dispose();
                AdminGUI admin = new AdminGUI();
            }
        });
        
        btntambahbuku.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String judulBuku = textjudulBuku.getText();
                String penulis = textpenulis.getText();
                String penerbit = textpenerbit.getText();
                String kodeBuku = textkodeBuku.getText();
                int tahunTerbit = Integer.valueOf(texttahunTerbit.getText());
                int jumlahBuku = Integer.valueOf(textjumlahBuku.getText());
                allobjcontroller.bc.insert(judulBuku, penulis, penerbit, kodeBuku, tahunTerbit, jumlahBuku);
                JOptionPane.showMessageDialog(null,"Input Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                reset();
                tabelbuku.setModel(allobjcontroller.bc.listbuku());
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Format penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
        }
     }

   });
        
        btnupdatebuku.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String judulBuku = textjudulBuku.getText();
                String penulis = textpenulis.getText();
                String penerbit = textpenerbit.getText();
                String kodeBuku = textkodeBuku.getText();
                int tahunTerbit = Integer.valueOf(texttahunTerbit.getText());
                int jumlahBuku = Integer.valueOf(textjumlahBuku.getText());
                allobjcontroller.bc.update(index, judulBuku, penulis, penerbit, kodeBuku, tahunTerbit, jumlahBuku);
                JOptionPane.showMessageDialog(null,"Input Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                reset();
                tabelbuku.setModel(allobjcontroller.bc.listbuku());
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Format penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
        }
     }

   });
        
        tabelbuku.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelbuku.getSelectedRow();
                index=i;
                textjudulBuku.setText(allobjcontroller.bc.listbuku().getValueAt(i, 0).toString());
                textpenulis.setText(allobjcontroller.bc.listbuku().getValueAt(i, 1).toString());
                textpenerbit.setText(allobjcontroller.bc.listbuku().getValueAt(i, 2).toString());
                textkodeBuku.setText(allobjcontroller.bc.listbuku().getValueAt(i, 3).toString());
                texttahunTerbit.setText(allobjcontroller.bc.listbuku().getValueAt(i, 4).toString()); 
            }            
        });
        
        btnhapusbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    allobjcontroller.bc.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelbuku.setModel(allobjcontroller.bc.listbuku());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
                
    }
    
        void reset(){
        textjudulBuku.setText(null);//ISI
        textpenulis.setText(null);
        textpenerbit.setText(null);
        textkodeBuku.setText(null);
        texttahunTerbit.setText(null);
        textjumlahBuku.setText(null);
    }

}