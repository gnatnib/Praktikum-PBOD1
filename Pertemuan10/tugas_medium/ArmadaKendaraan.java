/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas ArmadaKendaraan
 */

import java.util.ArrayList;
import java.util.List;

public class ArmadaKendaraan<T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(List<? extends T> newArmada){
        armada.addAll(newArmada);
    }

    public List<T> getAllArmada(){
        return armada;
    }
}
