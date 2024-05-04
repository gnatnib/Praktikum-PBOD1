package Latihan;

abstract class Penduduk{
    protected String noKtp;
    protected String nama;
    protected String NPWP;
    protected double tarifPajak;

    public Penduduk(String noKtp, String nama, String NPWP, double tarifPajak) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.NPWP = NPWP;
        this.tarifPajak = tarifPajak;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNoKtp(){
        return this.noKtp;
    }
    public String getNPWP(){
        return this.NPWP;
    }
    public double getTarifPajak(){
        return this.tarifPajak;
    }
    public void cetakInfo(){
        System.out.println("NoKtp : "+ getNoKtp());
        System.out.println("Nama : "+ getNama());
        System.out.println("NPWP : "+ getNPWP());
        System.out.println("Tarif : " + getTarifPajak());
    }
    public abstract double hitungpajak();
}  
