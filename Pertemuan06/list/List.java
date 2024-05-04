/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */
package list;

import java.util.ArrayList;

public abstract class List {
    //attribute
    protected ArrayList<Object> list;
    
    //konstruktor
    List(){
        list = new ArrayList<>();
    }
    
    //method
    public int getSize(){
        return list.size();
    }
    
    public Object getElmt(int i){
        return list.get(i);
    }
    
    public abstract boolean cekTypeElmt(Object elmt);
    
    public void add(Object elmt) throws Exception{
        if(cekTypeElmt(elmt)){
            list.addLast(elmt);
        }else{
            throw new Exception("Tipe elemen tidak sesuai.");
        }
    }
   
    public abstract void del();
    
    public abstract void cetak();
}
