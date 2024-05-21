/*
 * Nama         : Bintang Syafrian Rizal
 * NIM          : 24060122120031
 * Lab          : PBO D1
 * Tanggal      : 21 Mei 2024
 * File         : MySQLPersonDAO.java
 * Deskripsi    : implementasi PersonDAO untuk MySQL
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama db, user, password
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "root");

        // Query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // Tutup koneksi database
        con.close();
    }
}