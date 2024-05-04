/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package TugasWajib;

public class TestSenjata {
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isipeluru(3);
        kontrolAK47.menembak(5);

        kontrolm16.menembak(1);
        kontrolm16.isipeluru(5);
        kontrolm16.menembak(2);
    }
}
