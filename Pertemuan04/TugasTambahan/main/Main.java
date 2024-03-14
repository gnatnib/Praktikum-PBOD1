package TugasTambahan.main;

import TugasTambahan.university.*;

public class Main {
    public static void main(String[] args) {
        
        Student s1,s2;
        Course matkul1,matkul2,matkul3,matkul4;
        Lecture l1,l2;

        s1 = new Student("Bintang Syafrian Rizal", "Jalan Seroja No. 8, Kelurahan Sawah Besar, Kecamatan Tanah Abang, Kota Jakarta Pusat, DKI Jakarta", "24060122120031", 19);
        s2 = new Student("Azizi Asadel", "Jalan Seroja No. 8, Kelurahan Sawah Besar, Kecamatan Tanah Abang, Kota Jakarta Pusat, DKI Jakarta", "24060122130030", 19);

        l1 = new Lecture("Khadijah, S.Kom., M.Cs.", "Jalan Merdeka No. 10, Kelurahan Sukajaya, Kecamatan Cikarang Utara, Kota Bekasi, Jawa Barat", "198903032015042002", 45);
        l2 = new Lecture("Prajanto Wahyu Adi, M.Kom.", "Jalan Dahlia No. 25, Kelurahan Kedaton, Kecamatan Bandar Lampung Tengah, Kota Bandar Lampung, Lampung", "198803222020121010", 39);
        
        matkul1 = new Course("PAIK4123", "Pemrograman Berorientasi Objek",l1);
        matkul2 = new Course("PAIK1230", "Rekayasa Perangkat Lunak", l1);
        matkul3 = new Course("PAIK1293", "Algoritma dan Analisis Strategi",l2);
        matkul4 = new Course("PAIK9423", "Manajemen Basis Data",l2);

        l1.courseTaught(matkul1);
        l1.courseTaught(matkul2);  
        l2.courseTaught(matkul3);
        l2.courseTaught(matkul4);

        l1.getDetails();
        l2.getDetails();

        s2.getDetails();
        s1.getDetails();

        s1.enrollCourse(matkul1);
        s1.enrollCourse(matkul2);
        s2.enrollCourse(matkul3);
        s2.enrollCourse(matkul4);

        matkul1.addStudent(s1);
        matkul2.addStudent(s1);
        matkul3.addStudent(s2);
        matkul4.addStudent(s2);

        s1.viewEnrolledCourse();
        s2.viewEnrolledCourse();

        l1.viewTaughtCourses();
        l2.viewTaughtCourses();

        matkul1.viewEnrolledStudents();
        matkul2.viewEnrolledStudents();
        matkul3.viewEnrolledStudents();
        matkul4.viewEnrolledStudents();

        System.out.println("Menghapus data mahasiswa dari matkul4");
        matkul4.removeStudent(s2);

        matkul4.viewEnrolledStudents();
    }
}

