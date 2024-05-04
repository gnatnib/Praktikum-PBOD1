/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;

public class StackOfPoints extends Stack{
    //konstruktor
    public StackOfPoints(){
    }
    
    //method
    @Override
    public boolean cekTypeElmt(Object elmt){
        return (elmt instanceof Point);
    }

    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    @Override
    public Point getElmt(int i){
       return (Point)super.getElmt(i);
    }
    
    @Override
    public Point getTop(){
       return (Point)super.getTop();
    }
}
