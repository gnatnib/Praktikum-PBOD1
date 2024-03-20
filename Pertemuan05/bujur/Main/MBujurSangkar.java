package bujur.Main;
import java.util.Scanner; //mengimpor scanner

import bujur.BujurSangkar.BujurSangkar; //mengimpor kelas BujurSangkar dari package BujurSangkar
public class MBujurSangkar {
    public static void main(String[] args){ //method main
        Scanner scan = new Scanner(System.in); //membuat objek scanner untuk input
        BujurSangkar hs = new BujurSangkar(); //membuat objek BujurSangkar
        System.out.print("Masukkan sisi: "); //menampilkan pesan untuk meminta inputan sisi dari user
        double sisi = scan.nextDouble(); //membaca input sisi dari user
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " +hs.hitungLuas(sisi)); //menampilkan luas bujur sangkar
        scan.close();  //menutup scanner
    }
}
