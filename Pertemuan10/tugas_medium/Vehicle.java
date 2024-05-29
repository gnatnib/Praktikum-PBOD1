/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas Vehicle
 */

 public abstract class Vehicle {
    public abstract double calcFuelEfficiency();

    public abstract double calcTripDistance();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}