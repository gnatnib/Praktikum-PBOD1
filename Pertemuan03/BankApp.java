/*
    Nama    : Bintang Syafrian Rizal
    Nim	    : 24060122120031
    Desc	: Main BankApp.java
    file	: BankApp.java
*/

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(1000);
        System.out.println("Selamat datang di BankApp");

        while (true){
            System.out.println("Pilih transaksi: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Masukkan jumlah deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try{
                        bankAccount.withdraw(withdrawAmount);
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saldo: " + bankAccount.getBalance());
                    break;
                case 4:
                scanner.close();
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
            }
        
            while (true){
                System.out.print("\nLanjutkan transaksi? (y/n): ");
                String answer = scanner.next();
                if (answer.toLowerCase().equals("y")){
                    break;
                }
                else if (answer.toLowerCase().equals("n")){
                    scanner.close();
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    System.exit(0);
                }
                else{
                    System.out.println("Pilih y atau n");
                }
            }
        }
    }
}
