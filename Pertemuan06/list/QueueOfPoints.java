/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;
public class QueueOfPoints extends Queue {
    //konstruktor
    public QueueOfPoints(){
    }
    
    //method
    @Override
    public boolean cekTypeElmt(Object elmt){
        return (elmt instanceof Point);
    }
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
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
    public Point getHead(){
       return (Point)super.getHead();
    }
    
    @Override
    public Point getTail(){
       return (Point)super.getTail();
    }
}
