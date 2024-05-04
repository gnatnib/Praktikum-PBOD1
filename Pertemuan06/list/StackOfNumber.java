/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;

public class StackOfNumber extends Stack {
    //konstruktor
    public StackOfNumber(){
    }
    
    //method
    @Override
    public boolean cekTypeElmt(Object elmt){
        return (elmt instanceof Number);
    }
}
