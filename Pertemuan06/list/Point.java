/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */
package list;

public class Point {
    //attribute
    private double absis;
    private double ordinat;
      
    //konstruktor
    public Point(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //Overloading konstruktor
    public Point(){
        this(0,0);
    }
    
    //method
    public double getOrdinat(){
        return this.ordinat;
    }
    
    public double getAbsis(){
        return this.absis;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }
    
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    
    public void cetak(){
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}
