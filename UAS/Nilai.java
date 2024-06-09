public class Nilai {
    private String idMateri;
    private double nilaiTest;

    public Nilai(String idMateri, double nilaiTest){
        this.idMateri = idMateri;
        this.nilaiTest = nilaiTest;
    }

    public String getIdMateri(){
        return idMateri;
    }

    public double getNilaiTest(){
        return nilaiTest;
    }

    public void setIdMateri(String idMateri){
        this.idMateri = idMateri;
    }

    public void setNilaiTest(double nilaiTest){
        this.nilaiTest = nilaiTest;
    }
}
