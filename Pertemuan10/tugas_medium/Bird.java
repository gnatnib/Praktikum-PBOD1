/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas Bird
 */

public class Bird extends Animal implements iFlyer {
    public void Eat(){
        System.out.println("Burung adalah hewan yang memakan biji - bijian");
    }

    public void takeOff(){
        System.out.println("Burung lepas landas menggunakan dorongan sayapnya");
    }

    public void land(){
        System.out.println("Burung mendarat dengan kedua kakinya");
    }

    public void fly(){
        System.out.println("Burung terbang dengan kedua sayapnya");
    }

    public void layEggs(){
        System.out.println("Burung adalah hewan bertelur");
    }

    public void buildNest(){
        System.out.println("Burung dapat membangun sarangnya sendiri");
    }
}
