/*
 * Nama         : Bintang Syafrian Rizal
 * NIM          : 24060122120031
 * Lab          : PBO D1
 * Tanggal      : 21 Mei 2024
 * File         : MainDAO.java
 * Deskripsi    : Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Bintang Syafrian");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}