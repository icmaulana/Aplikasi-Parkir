/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasiparkir;

import java.util.Scanner;

/**
 *
 * @author Achmad Fathullah
 */
public class ParkirUin {
Scanner scan = new Scanner(System.in);
parkir park = new parkir();
MenuParkir mp = new MenuParkir();

public static void main(String[] args) {
ParkirUin tgs = new ParkirUin();
tgs.Login();

}

public void Login() {
int blokir=0;
String usr;
String pass;
while(blokir<3){
park.setUsername("admin");
park.setPassword("admin");
System.out.println("*******************LOGIN***********************");
System.out.println("Masukkan Username Anda :");
usr = scan.nextLine();
System.out.println("Masukan Password Anda :");
pass = scan.nextLine();

if (park.getUsername().equals(usr) && (park.getPassword().equals(pass))) { // equals itu sama saja dengan = (sama dengan) tapi untuk membandingkan string
System.out.println("Selamat Datang Admin " + park.getUsername());
mp.MenuParkir();
} else {

}
blokir++;
}
System.out.println("anda telah diblokir. Silahkan Hubungi bagian operasional");
}
}
