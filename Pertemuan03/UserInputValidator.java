/*
    Nama    : Bintang Syafrian Rizal
    Nim	    : 24060122120031
    Desc	: class UserInputValidator.java
    file	: UserInputValidator.java
*/

public class UserInputValidator {
    public static void validateUsername(String username){
        //buat assertion yang memenuhi persyaratan username
        assert username.length() >= 5 : "Username harus memiliki panjang minimal 5 karakter";
        assert username.length() <= 20 : "Username harus memiliki panjang maksimal 20 karakter";
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Username hanya boleh mengandung huruf dan angka";
    }
    public static void validateEmail(String email){
        assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Email tidak valid";
    }
    public static void validateAge(int age){
        assert age >= 17 && age <= 99 : "Umur harus lebih dari 17 tahun dan kurang dari 99 tahun";
    }
}

