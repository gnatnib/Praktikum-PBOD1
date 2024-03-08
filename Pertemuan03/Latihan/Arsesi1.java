/**
 * Arsesi1
 */
public class Arsesi1 {

    public static void main(String[] args) {
        int x = 0;
        if (x>0){
            System.out.println("x bilangan ppositif");
        }
        else{
            assert(x<0) : "kode error";
            System.out.println("x bilangan negatif");
        }
    }
}