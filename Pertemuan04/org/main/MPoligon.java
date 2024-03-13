/*
Nama    : Bintang Syafrian Rizal
NIM     : 24060122120031
File    : MPoligon.java
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
    
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());

        Segitiga triangle = new Segitiga(10, 20, 3);
        triangle.printinfo();
        System.out.println("Luas Segitiga :"+triangle.hitungLuas());
    }
}