package view;

import controller.AdminController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class LoginGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JTextField textidlogin;//ISI
    JLabel idLogin,labelpass;
    JButton btnlogin;
    JPasswordField passwordlogin;//AGAR BENTUK PASSWORD
    
    public LoginGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.BLUE);
        top = new JLabel("Perpustakaan");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
        
        idLogin = new JLabel("ID Admin");
        idLogin.setBounds(250,180,100,30);
        LogReg.add(idLogin);
        
        textidlogin = new JTextField();
        textidlogin.setBounds(250,210,200,30);
        LogReg.add(textidlogin);
        
        labelpass = new JLabel("Password");
        labelpass.setBounds(250,240,100,30);
        LogReg.add(labelpass);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(250,270,200,30);
        LogReg.add(passwordlogin);
        
        btnlogin = new JButton("Login");
        btnlogin.setBounds(250,320,100,40);
        btnlogin.setBackground(Color.white);
        LogReg.add(btnlogin);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    allobjcontroller.am.dataAdmin();
                    allobjcontroller.am.cekAdmin(textidlogin.getText(),passwordlogin.getText());
                    String nama = allobjcontroller.am.adminEntity().getNama();
                    JOptionPane.showMessageDialog(null,"Selamat Datang"+nama+"Di Perpustakaan!","information",JOptionPane.INFORMATION_MESSAGE);
                    AdminGUI admin = new AdminGUI();
                    LogReg.dispose();
                }
                catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"ID atau Password salah","information",JOptionPane.INFORMATION_MESSAGE);
                    reset();
                }
            }
        });
    }
    void reset(){
        textidlogin.setText(null);//ISI
        passwordlogin.setText(null);
    }
}
