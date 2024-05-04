package Latihan;

public class Petani extends Penduduk {
    private String kota;
    private String jenisTanaman;
    public static int jmlPetani;

    public Petani(String noKtp, String nama, String kota, String jenisTanaman) {
        super(noKtp, nama, "", 0);
        this.kota = kota;
        this.jenisTanaman = jenisTanaman;
        jmlPetani++;
    }
    public String getJenisTanaman(){
        return this.jenisTanaman;
    }
    public static int getJmlPetani(){
        return jmlPetani;
    }
    @Override
    public void cetakInfo() {
        System.out.println("PETANI");
        System.out.println("NoKTP : "+super.getNoKtp());
        System.out.println("Nama : "+super.getNama());
        System.out.println("Kota : " + kota);
    }

    @Override
    public double hitungpajak() {
        return 0;
}
}