/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Achmad Fathullah
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Achmad Fathullah
 */
public class menu extends JFrame {
JLabel tanggal = new JLabel();
JLabel Njam = new JLabel();
JButton masuk = new JButton();
JButton keluar = new JButton();
JLabel label1 = new JLabel();

public menu (){

tanggal.setFont(new java.awt.Font("Dialog",Font.BOLD, 14));
tanggal.setForeground(Color.red);
tanggal.setText("Day - MM - YYYY");
tanggal.setBounds(new Rectangle(20, 5, 120, 15));

Njam.setFont(new java.awt.Font("Dialog", Font.BOLD, 14));
Njam.setForeground(Color.red);
Njam.setText("HH : MM : SS");
Njam.setBounds(new Rectangle(130, 5, 80, 15));    

}
}