/*
    Nama : Bintang Syafrian Rizal
    NIM  : 24060122120031
    Lab  : Pemrograman Berorientasi Objek D1
    Deskripsi : Body Lecture.java
    File : Lecture.java
    Tanggal Pengerjaan : 1 Maret 2024
 */

public class Lecture {

    private String name,address,EmployeeID;
    private int age;
    private Course[] courseTaught = new Course[76];


    Lecture(String name, String address, String EmployeeID, int age) {
        this.name = name;
        this.address = address;
        this.EmployeeID = EmployeeID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.println("====================================");
        System.out.println("Nama   : "+name);
        System.out.println("Alamat : "+address);
        System.out.println("NIP    : "+EmployeeID);
        System.out.println("Umur   : "+age);
        System.out.println("====================================");
    }
   

    public void courseTaught(Course C){
        for(int i = 0;i<courseTaught.length;i++){
            if(courseTaught[i]==null){
                courseTaught[i] = C;
                break;
            }
        }
    }

    public void viewTaughtCourses(){
        for(int i = 0;i<courseTaught.length;i++){
            if(courseTaught[i]==null){
                break;
            }
            System.out.println("Matkul yang diajar "+getName()+": "+courseTaught[i].getCourseCode()+" "+courseTaught[i].getCourseName());
        }
        System.out.println("====================================");
    }
    
}