package TugasTambahan.university;

public class Course {
    
    private String courseCode,courseName;
    private Lecture lecture;
    private Student[] studentsEnrolled = new Student[100];


    public Course(String courseCode, String courseName, Lecture lecture) {
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
        System.out.println("Enrolled students untuk mata kuliah " + courseCode + ": " + courseName);
        boolean noStudentsEnrolled = true;
        
        for (int i = 0; i < studentsEnrolled.length; i++) {
            if (studentsEnrolled[i] != null) {
                noStudentsEnrolled = false;
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Nama  : " + studentsEnrolled[i].getName());
                System.out.println("Alamat: " + studentsEnrolled[i].getAddress());
                System.out.println("NIM.  : " + studentsEnrolled[i].getStudentID());
                System.out.println("Umur  : " + studentsEnrolled[i].getAge());
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