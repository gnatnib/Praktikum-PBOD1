package TugasTambahan.university;

import TugasTambahan.person.Person;

public class Lecture extends Person {
    private String EmployeeID;
    private int age;
    private Course[] courseTaught = new Course[76];


    public Lecture(String name, String address, String EmployeeID, int age) {
        super(name, address, age);
        this.EmployeeID = EmployeeID;
        this.courseTaught = new Course[76];
    }

    @Override
    public String getName() {
        return super.getName();
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

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("NIP    : " + EmployeeID);
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
