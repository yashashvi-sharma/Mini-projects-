import java.util.Scanner;

class LibraryManagementSystem {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Book name: ");
      String book = sc.nextLine();

      System.out.print("Enter Author name: ");
      String author = sc.nextLine();

      System.out.print("Enter book ID: ");
      int bookID = sc.nextInt();

      System.out.print("Is the book available? (1 = Yes, 0 = No): ");
      int available = sc.nextInt();

      System.out.println("\n----- Library Details -----");
      System.out.println("Book Name: " + book);
      System.out.println("Author: " + author);
      System.out.println("Book ID: " + bookID);

      if (available == 1) {
          System.out.println("Status: Available");
      } else {
          System.out.println("Status: Not Available");
      }

      sc.close();
   }
}
