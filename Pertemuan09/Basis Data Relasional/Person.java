/*
 * Nama         : Bintang Syafrian Rizal
 * NIM          : 24060122120031
 * Lab          : PBO D1
 * Tanggal      : 21 Mei 2024
 * File         : Person.java
 * Deskripsi    : Person database object
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}