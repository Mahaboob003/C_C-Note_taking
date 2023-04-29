import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakingApp {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> notes = new ArrayList<String>();
      String note;
      int choice;

      do {
         System.out.println("\nNote Taking Menu");
         System.out.println("1. Add a note");
         System.out.println("2. View all notes");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
            case 1:
               scanner.nextLine();
               System.out.print("\nEnter a note: ");
               note = scanner.nextLine();
               notes.add(note);
               System.out.println("\nNote added successfully");
               break;
            case 2:
               if (notes.size() == 0) {
                  System.out.println("\nNo notes found");
               } else {
                  System.out.println("\nAll Notes:");
                  for (int i = 0; i < notes.size(); i++) {
                     System.out.println((i+1) + ". " + notes.get(i));
                  }
               }
               break;
            case 3:
               System.out.println("\nExiting the program...");
               break;
            default:
               System.out.println("\nInvalid choice");
         }
      } while (choice != 3);

      scanner.close();
   }
}
