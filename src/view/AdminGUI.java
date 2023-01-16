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

public class AdminGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnbuku,btnuser,btnpeminjaman,btnback,btnpengembalian;
    
    public AdminGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.white);
        top = new JLabel("=MENU UTAMA=");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
        
        btnbuku = new JButton("Data Buku");
        btnbuku.setBounds(270,150,300,50);
        btnbuku.setBackground(Color.CYAN);
        LogReg.add(btnbuku);
        
//         ===== USER =====
        btnuser = new JButton("Data User");
        btnuser.setBounds(270,250,300,50);
        btnuser.setBackground(Color.CYAN);
        LogReg.add(btnuser);
        
        // ===== EXIT =====
        btnback = new JButton("EXIT");
        btnback.setBounds(270,150,300,50);
        btnback.setBackground(Color.RED);
        LogReg.add(btnback);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               LogReg.dispose();
               LoginGUI login_g = new LoginGUI();
            }
    });
    btnbuku.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            BukuGUI bg = new BukuGUI();
        }
    });
    
    btnuser.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            UserGUI ug = new UserGUI();
        }
    });
    }
}
