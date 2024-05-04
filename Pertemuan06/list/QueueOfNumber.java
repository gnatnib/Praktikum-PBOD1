/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package list;
public class QueueOfNumber extends Queue{
    //konstruktor
    public QueueOfNumber(){
    }
    //method
    @Override
    public boolean cekTypeElmt(Object elmt){
        return (elmt instanceof Number);
    }
}
