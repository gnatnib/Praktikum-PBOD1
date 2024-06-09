import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        //instansiasi
        Materi Teori = new Teori("KUR101","Analisa Perangkat Lunak Dasar",Arrays.asList("Soal1","Soal2"));
        Materi Praktikum = new Praktikum("KUR201","Modul DFD", Arrays.asList("pembuatan dfd 01","pembuatan dfd 02"));
        Materi StudiKasus = new StudiKasus("KUR301", "StudiKasus 1", Arrays.asList("Bagaimana pembuatan flow diagram","efhfousf"));

        //pengisian nilai
        Teori.setIdMateri("Teo11");
        Praktikum.setIdMateri("Prak11");
        StudiKasus.setIdMateri("Std111");

        Teori.setKonten("vidTeo11");
        Praktikum.setKonten("Prakvid11");
        StudiKasus.setKonten("StudiKasusVid11");

        Teori.setSoalList(Arrays.asList("soal1","Soal2"));
        Praktikum.setSoalList(Arrays.asList("SoalPrak11","SoalPrak12"));
        StudiKasus.setSoalList(Arrays.asList("Studi11","Studi12"));

        //akses informasi
        System.out.println("ID Materi: " + Teori.getIdMateri());
        System.out.println("Konten: " + Teori.getKonten());
        System.out.println(Teori.getSoalTest() + "\n");
        
        System.out.println("ID Materi: " + Praktikum.getIdMateri());
        System.out.println("Konten: " + Praktikum.getKonten());
        System.out.println(Praktikum.getSoalTest()+ "\n");
        
        System.out.println("ID Materi: " + StudiKasus.getIdMateri());
        System.out.println("Konten: " + StudiKasus.getKonten());
        System.out.println(StudiKasus.getSoalTest() + "\n");
    
        //nomor 2
        listNilai listnilai = new listNilai();
        Nilai siswa1 = new Nilai("M001", 85.1);
        Nilai siswa2 = new Nilai("M001",90.0);
        listnilai.addNilai(siswa1);

    }   

}
