/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;
public abstract class Stack extends List {
    //konstruktor
    protected Stack(){
    }
    
    public Object getTop(){
        return getElmt(getSize()-1);
    }
    
    @Override
    public void del(){
        list.removeLast();
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElmt(i));
        }
    }
}