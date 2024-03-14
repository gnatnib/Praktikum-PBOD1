package TugasTambahan.university;

import TugasTambahan.person.Person;

public class Student extends Person {
    private String studentID;
    private Course[] enrolled;

    public Student(String name, String address, String studentID, int age) {
        super(name, address, age);
        this.studentID = studentID;
        this.enrolled = new Course[144];
    }

    public String getStudentID() {
        return studentID;
    }

    public Course[] getEnrolled() {
        return enrolled;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("NIM    : " + studentID);
    }

    public void enrollCourse(Course course) {
        for (int i = 0; i < enrolled.length; i++) {
            if (enrolled[i] == null) {
                enrolled[i] = course;
                break;
            }
        }
    }

    public void viewEnrolledCourse() {
        System.out.println("Daftar Course yang diambil oleh " + getName() + " :");
        if (enrolled[0] == null) {
            System.out.println("Tidak ada.");
            return;
        }
        for (int i = 0; i < enrolled.length; i++) {
            if (enrolled[i] == null) {
                break;
            }

            System.out.println((i + 1) + ". " + enrolled[i].getCourseCode() + " : " + enrolled[i].getCourseName());
            System.out.println("Pengajar: " + enrolled[i].getLecture().getName());
            System.out.println("====================================");
        }
    }
}
