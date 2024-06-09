import java.util.List;

public class Materi {
    private String idMateri;
    private String konten;
    private List<String> soalTest;

    public Materi(String idMateri, String konten, List<String>soaTest){
        this.idMateri = idMateri;
        this.konten = konten;
        this.soalTest = soalTest;
    }

    public String getIdMateri(){
        return idMateri;
    }

    public String getKonten(){
        return konten;
    }

    public List<String> getSoalTest(){
        return soalTest;
    }

    public void setIdMateri(String idMateri){
        this.idMateri = idMateri;
    }

    public void setKonten(String konten){
        this.konten = konten;
    }

    public void setSoalList(List<String>soalTest){
        this.soalTest = soalTest;
    }
    
}