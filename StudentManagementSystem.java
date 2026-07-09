import java.util.Scanner;

class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);

        if (marks >= 40); {
            System.out.println("Result: Pass");
        } else { 
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
