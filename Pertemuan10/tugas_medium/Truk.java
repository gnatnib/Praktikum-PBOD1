/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas Truk
 */

 public class Truk extends Vehicle {
    private double maxLoad;

    public Truk(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad * 1.5;
    }

    public double calcTripDistance() {
        return 1500.00;
    }

    @Override
    public String toString() {
        return "Truk adalah angkutan darat yang sangat handal";
    }
}