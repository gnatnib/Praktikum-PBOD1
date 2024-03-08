/*
    Nama    : Bintang Syafrian Rizal
    Nim	    : 24060122120031
    Desc	: class UserRegistration.java
    file	: UserRegistration.java
*/
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter username : ");
        String username = scanner.nextLine();
        UserInputValidator.validateUsername(username);

        System.out.println("Enter email address : ");
        String email = scanner.nextLine();
        UserInputValidator.validateEmail(email);

        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        UserInputValidator.validateAge(age);

        System.out.println("User registration successful!");

        scanner.close();
    }
}
