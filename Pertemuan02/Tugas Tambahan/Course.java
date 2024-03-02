/*
    Nama : Bintang Syafrian Rizal
    NIM  : 24060122120031
    Lab  : Pemrograman Berorientasi Objek D1
    Deskripsi : Body Course.java
    File : Course.java
    Tanggal Pengerjaan : 1 Maret 2024
 */

public class Course {
    
    private String courseCode,courseName;
    private Lecture lecture;
    private Student[] studentsEnrolled = new Student[100];


    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture) {
    
        this.lecture = lecture;
        
    }

    public void addStudent(Student student) {
        for (int i = 0; i < studentsEnrolled.length; i++) {
            if (studentsEnrolled[i] == student) {
                return;
            }
        }
        
        for (int i = 0; i < studentsEnrolled.length; i++) {
            if (studentsEnrolled[i] == null) {
                studentsEnrolled[i] = student;
                return;
            }
        }
    }
        
    public void removeStudent(Student S){

        for(int i = 0;i<studentsEnrolled.length;i++){
            if(studentsEnrolled[i]==S){
                studentsEnrolled[i] = null;
                break;
            }
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("Enrolled students:");
        boolean noStudentsEnrolled = true;
        
        for (int i = 0; i < studentsEnrolled.length; i++) {
            if (studentsEnrolled[i] != null) {
                noStudentsEnrolled = false;
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + studentsEnrolled[i].getName());
                System.out.println("Address: " + studentsEnrolled[i].getAddress());
                System.out.println("Student ID: " + studentsEnrolled[i].getStudentID());
                System.out.println("Age: " + studentsEnrolled[i].getAge());
                System.out.println("------------------------------------");
            } else {
                break;
            }
        }
        
        if (noStudentsEnrolled) {
            System.out.println("Tidak ada.");
        }
    }             
}