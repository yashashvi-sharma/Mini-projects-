import java.util.Scanner;

class ToDoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Task 1: ");
        String task1 = sc.nextLine();

        System.out.print("Enter Task 2: ");
        String task2 = sc.nextLine();

        System.out.println("\n---- To-Do List -----");
        System.out.println("1. " + task1);
        System.out.println("2. " + task2);

        sc.close();
    }
}  
