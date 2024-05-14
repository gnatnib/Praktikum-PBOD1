class Kupu {
    void gerak(){

    }
}

class Ulat extends Kupu {
    void gerak(){
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu{
    void gerak(){
        System.out.println("kepompong diam");
    }
    
}

class KupuDewasa extends Kupu{
    void gerak(){
        System.out.println("kupu terbang");
    }
}

class Data <T> {
    T isi;
    T getIsi(){
        return this.isi;
    }

    void setIsi(T x){
        this.isi = x;
    }
}

public class Mainb {
    public static void main(String[] args) {
        //Kamus Lokal
        Ulat K;
        Data <Kupu> anu;

        //Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }

}
