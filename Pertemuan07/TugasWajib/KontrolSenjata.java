/*
 * Nama : Bintang Syafrian Rizal
 * NIM  : 24060122120031
 * Lab  : PBO D1
 */

package TugasWajib;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isipeluru(int peluru){
        senjata.setPeluru(senjata.getPeluru() + peluru);
        System.out.println(">> Peluru berhasil ditambah: " + peluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (isAdaPeluru()){
            for (int i=0; i<jumlah; i++){
                if (isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru Habis");
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public void menusuk(){
        if (senjata.isMenusuk()){
            System.out.println("Jleb!");
        }
        else{
            System.out.println("Gagal, belum pasang bayonet");
        }
    }
}