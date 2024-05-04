package Latihan;

class Wirausaha extends Penduduk {
    private String SIUP;
    private double omsetPerTahun;
    public static int jmlWirausaha;

    public Wirausaha(String noKtp, String nama, String NPWP, double tarifPajak, String SIUP, double omsetPerTahun) {
        super(noKtp, nama, NPWP, tarifPajak);
        this.SIUP = SIUP;
        this.omsetPerTahun = omsetPerTahun;
        jmlWirausaha++;
    }
    public static int getJmlWirausaha(){
        return jmlWirausaha;
    }
    @Override
    public void cetakInfo() {
        System.out.println("WIRAUSAHA");
        super.cetakInfo();
        System.out.println("Pajak : " + hitungpajak());
        System.out.println("SIUP : " + SIUP);
        System.out.println("Omset " + omsetPerTahun);
    }

    @Override
    public double hitungpajak() {
        return omsetPerTahun * tarifPajak;
    }
}