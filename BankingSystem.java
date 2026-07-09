import java.util.Scanner;

class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter deposit amount: ");
        int deposit = sc.nextInt();

        balance = balance + deposit;

        System.out.println("Current Balance: " + balance);

        sc.close();
    }
}
