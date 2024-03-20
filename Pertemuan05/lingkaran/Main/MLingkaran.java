package lingkaran.Main;
import java.util.Scanner;

import lingkaran.BangunDatar.Lingkaran; //import class lingkaran dari package BangunDatar

public class MLingkaran { //declare class 
    public static void main(String[] args) { //method main
        Scanner scan = new Scanner(System.in); //membuat scanner baru untuk input
        System.out.print("Masukkan jejari: "); //menampilkan pesan untuk input
        double jejari = scan.nextDouble(); //membaca input jejari dari user
        Lingkaran l = new Lingkaran(jejari); //membuat objek lingkaran dengan jejari yang diinput
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close(); //Menutup scanner
    }
}
