/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;

public abstract class Queue extends List {
    //konstruktor
    public Queue(){
    }
    
    public Object getHead(){
        return getElmt(0);
    }
    
    public Object getTail(){
        return getElmt(getSize()-1);
    }
     
    @Override
    public void del(){
        list.removeFirst();
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
            System.out.println(getElmt(i));
        }
    }
}