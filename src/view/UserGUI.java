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

public class UserGUI {
    private static UserController uc = new UserController();
    JFrame User = new JFrame();
    JLabel top,labelnama,labelnoTelp,labelalamat;
    JTextField textnama,textnoTelp,textalamat;
    JButton btntambahUser,btnhapusUser,btnback;
    JTable tabeluser = new JTable();
    JScrollPane scrolluser = new JScrollPane(tabeluser);
    int index;
    
    public UserGUI(){
        User.setSize(900,700);
        User.setLayout(null);
        User.getContentPane().setBackground(Color.WHITE);
        top = new JLabel("Data User");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        User.add(top);
        
        scrolluser.setBounds(300,180,600,270);
        tabeluser.setModel(uc.listuser());
        User.add(scrolluser);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(30,150,100,30);
        User.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(30,180,200,30);
        User.add(textnama);
        
        labelnoTelp = new JLabel("No Telp");
        labelnoTelp.setBounds(30,210,100,30);
        User.add(labelnoTelp);
        
        textnoTelp = new JTextField();
        textnoTelp.setBounds(30,240,200,30);
        User.add(textnoTelp);
        
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(30,270,100,30);
        User.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(30,300,200,30);
        User.add(textalamat);
        
        btntambahUser = new JButton("Tambah User");
        btntambahUser.setBounds(50,400,150,30);
        User.add(btntambahUser);
        
        btnhapusUser = new JButton("Hapus User");
        btnhapusUser.setBounds(50,440,150,30);
        User.add(btnhapusUser);
        
        btnback = new JButton("Back");
        btnback.setBounds(50,500,150,30);
        btnback.setBackground(Color.red);
        User.add(btnback);
        
        User.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        User.setVisible(true);
        User.setLocationRelativeTo(null);
        
         btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                User.dispose();
                AdminGUI admin = new AdminGUI();
            }
        });
         
         btntambahUser.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String nama = textnama.getText();
                String noTelp = textnoTelp.getText();
                String alamat = textalamat.getText();
                allobjcontroller.uc.insert(nama, noTelp, alamat);
                JOptionPane.showMessageDialog(null,"Input User Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                reset();
                tabeluser.setModel(allobjcontroller.uc.listuser());
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Format penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
        }
     }

   });
         
          tabeluser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabeluser.getSelectedRow();
                index=i;
                textnama.setText(allobjcontroller.uc.listuser().getValueAt(i, 0).toString());
                textnoTelp.setText(allobjcontroller.uc.listuser().getValueAt(i, 1).toString());
                textalamat.setText(allobjcontroller.uc.listuser().getValueAt(i, 2).toString());

            }            
        });
          
            btnhapusUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    allobjcontroller.uc.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus User Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabeluser.setModel(allobjcontroller.uc.listuser());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
        void reset(){
        textnama.setText(null);
        textnoTelp.setText(null);
        textalamat.setText(null);
    }
}
