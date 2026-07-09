import java.util.Scanner;

class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Transaction Successfull");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
