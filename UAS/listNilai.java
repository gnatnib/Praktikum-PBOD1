import java.util.ArrayList;
import java.util.List;

public class listNilai {
    private List<Nilai>nilaiList;

    public listNilai(){
        this.nilaiList = new ArrayList<>();
    }

    public void addNilai(Nilai nilai){
        nilaiList.add(nilai);
    }

    public List<Nilai> getNilaiList(){
        return nilaiList;
    }

    public double getTotalNilai(){
        double total = 0;
        for(Nilai nilai : nilaiList){
            total += nilai.getNilaiTest();
        }
        return total;
    }
}
