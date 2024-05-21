/*
 * Nama         : Bintang Syafrian Rizal
 * NIM          : 24060122120031
 * Lab          : PBO D1
 * Tanggal      : 21 Mei 2024
 * File         : DAOManager.java
 * Deskripsi    : pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}