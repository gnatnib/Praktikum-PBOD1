package bujur.BujurSangkar;
import bujur.BangunDatar.BangunDatar;

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

//Apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar, maka kelas BujurSangkar harus dideklarasikan sebagai kelas abstrak.
//Jika kelas BujurSangkar dideklarasikan sebagai kelas abstrak, maka kelas yang menggunakan kelas BujurSangkar harus membuat implementasi metode abstrak yang ada pada kelas BangunDatar agar fungsi dapat dijalankan.
//Jika tidak nanti akan terjadi error pada saat compile dan code tidak akan berjalan.