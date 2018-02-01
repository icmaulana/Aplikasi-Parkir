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
public class MenuParkir {
    Scanner scan = new Scanner(System.in);
int tarifParkir = 0;
int totalJamParkir;
int denda = 0;
double jumlahBayar = 0;
boolean kembali = false;

public void MenuParkir() {
System.out.println("**************************");
System.out.println("Masukkan Jam Masuk :");
int jamMasuk = scan.nextInt();
System.out.println("Masukkan Jam Keluar :");
int jamKeluar = scan.nextInt();

System.out.println("Tipe Kendaraan :");
System.out.println("1. Sepeda MOtor");
System.out.println("2. Mobil");
System.out.println("3. Bus");
System.out.println("Masukkan Kode Tipe Kendaraan :");
int tipeKendaraan = scan.nextInt();

totalJamParkir = jamKeluar - jamMasuk;
switch (tipeKendaraan) {
case 1:
tarifParkir = totalJamParkir * 2000;
break;
case 2:
tarifParkir = totalJamParkir * 5000;
break;
case 3:
tarifParkir = totalJamParkir * 7000;
break;
default:
tarifParkir = 0;
break;

}
System.out.println("**************conclusion***********");
System.out.println("Jam Masuk :" + jamMasuk+" WIB");
System.out.println("Jam Keluar :" + jamKeluar+" WIB");
System.out.println("total Waktu Parkir " + totalJamParkir + " jam");
System.out.println("tarif parkir : Rp. " + tarifParkir);
// System.out.println(“Tipe Kendaraan :”);
if (tipeKendaraan == 1) {
System.out.println("Tipe Kendaraan : Sepeda Motor");
} else if (tipeKendaraan == 2) {
System.out.println("Tipe Kendaraan : Mobil");
} else if (tipeKendaraan == 3) {
System.out.println("Tipe Kendaraan : Bus");
} else {
System.out.println("Tipe Kendaraan Tidak Terdaftar");
}

dendaParkir();
pilihanBayar();

}

public void pilihanBayar() {
int ya;
System.out.println("Apakah Anda Member ?");
System.out.println("1. Ya, Saya Member");
System.out.println("2. Bukan, Saya Bukan Member");
ya = scan.nextInt();
if (ya == 1) {
hitungBayarMember();
} else {
hitungBayar();
}

}

public void dendaParkir() {

for (int i = totalJamParkir; i >= 6; i++) {
int jamDenda = totalJamParkir - 6;
denda = jamDenda * 2000;
}

System.out.println("Denda : Rp. " + denda);
System.out.println("*********************************");

}

public void hitungBayar() {
jumlahBayar = denda + tarifParkir;
System.out.println("Total jumlah yang harus dibayar adalah : Rp." + jumlahBayar);
logout();
}

public void hitungBayarMember() {
double diskon, jumlahBayarMember;
String mmbr;
jumlahBayar = denda + tarifParkir;
diskon = jumlahBayar * 0.2;
jumlahBayarMember = jumlahBayar - diskon;
System.out.println("Total jumlah yang harus dibayar member adalah : Rp. " + jumlahBayarMember);
logout();

}

public void logout() {
int tamp = 0;
while (!kembali) {
System.out.println("*********menu****************");
System.out.println("1. Kembali ke halaman awal");
System.out.println("2. Keluar");
tamp = scan.nextInt();
if (tamp == 1) {
MenuParkir();
} else {
ParkirUin tgs = new ParkirUin();
tgs.Login();

}
kembali = true;
}

}
}
    

