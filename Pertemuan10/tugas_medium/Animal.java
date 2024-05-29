/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas Animal
 */

public abstract class Animal {
    public abstract void Eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
