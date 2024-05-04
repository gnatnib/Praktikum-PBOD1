package Latihan;

class Pns extends Penduduk {
    private String NIP;
    private Departemen departemen;
    public static int jmlPns;

    public Pns(String noKtp, String nama, String NPWP, double tarifPajak, String NIP, Departemen departemen) {
        super(noKtp,nama, NPWP, tarifPajak);
        this.NIP = NIP;
        this.departemen = departemen;
        jmlPns++;
        
    }
    public static int getJmlPNS(){
        return jmlPns;
    }

    @Override
    public void cetakInfo() {
        System.out.println("PNS");
        super.cetakInfo();
        System.out.println("Pajak : " + hitungpajak());
        System.out.println("NIP : " + NIP);
        System.out.println("Departemen : " + departemen.getNama());
        System.out.println("GajiPokok : " + departemen.getGajiPokok());
    }

    @Override
    public double hitungpajak() {
        return departemen.getGajiPokok() * 12 * tarifPajak;
    }
}