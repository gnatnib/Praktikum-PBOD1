/*
    Nama : Bintang Syafrian Rizal
    NIM  : 24060122120031
    Lab  : Pemrograman Berorientasi Objek D1
    Deskripsi : Body Student.java
    File : Student.java
    Tanggal Pengerjaan : 1 Maret 2024
 */

public class Student {

    private String name,address,studentID;
    private int age;
    private Course[] enrolled;


    Student(String name, String address, String studentID, int age) {
        this.name = name;
        this.address = address;
        this.studentID = studentID;
        this.age = age;
        this.enrolled = new Course[144];
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public Course[] getEnrolled(){
        return enrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.println("====================================");
        System.out.println("Nama   : "+name);
        System.out.println("Alamat : "+address);
        System.out.println("NIM    : "+studentID);
        System.out.println("Umur   : "+age);
        System.out.println("====================================");
    }

    public void enrollCourse(Course course){
        for (int i = 0; i < enrolled.length; i++) {
            if(getEnrolled()[i] == null){
                enrolled[i] = course;
                break;
            }
        }
    }

    public void viewEnrolledCourse(){
        System.out.println("Daftar Course yang diambil oleh "+getName()+" :");
        if(enrolled[0]==null){
            System.out.println("Tidak ada.");
            return;
        }
        for (int i = 0; i < enrolled.length; i++) {
            if(enrolled[i] == null){
                break;
            }

            System.out.println((i+1)+". "+enrolled[i].getCourseCode()+" : "+enrolled[i].getCourseName());
            System.out.println("Pengajar: "+enrolled[i].getLecture().getName());
            System.out.println("====================================");
        }


    }   
}