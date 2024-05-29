/*
    Nama        : Bintang Syafrian Rizal
    NIM         : 24060122120031
    Lab         : PBO D1
    Deskripsi   : FIle kelas Airport
 */

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name){
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin mendarat diberikan";
        }
        else{
            return "Izin mendarat ditolak";
        }
    }
}
