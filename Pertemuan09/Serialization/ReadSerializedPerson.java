/*
 * Nama         : Bintang Syafrian Rizal
 * NIM          : 24060122120031
 * Lab          : PBO D1
 * Tanggal      : 21 Mei 2024
 * File         : ReadSerializedPerson.java
 * Deskripsi    : Program untuk serialisasi objek Person
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = "+person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }    
}
