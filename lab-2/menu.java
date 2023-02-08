import java.util.*;

public class menu {
   public static List<String> names = new ArrayList<>();

   public static void main(String[] args) {
      int choice;
      Scanner sc = new Scanner(System.in);
      do {
         System.out.println("Menu Options:");
         System.out.println("1. Enter a name");
         System.out.println("2. Search for a name");
         System.out.println("3. Remove a name");
         System.out.println("4. Show all names");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();
         switch(choice) {
            case 1:
               System.out.print("Enter the name: ");
               String name = sc.next();
               names.add(name);
               break;
            case 2:
               System.out.print("Enter the name to search for: ");
               name = sc.next();
               if (names.contains(name)) {
                  System.out.println("Name found in the list.");
               } else {
                  System.out.println("Name not found in the list.");
               }
               break;
            case 3:
               System.out.print("Enter the name to remove: ");
               name = sc.next();
               if (names.remove(name)) {
                  System.out.println("Name removed from the list.");
               } else {
                  System.out.println("Name not found in the list.");
               }
               break;
            case 4:
               System.out.println("All names: " + names);
               break;
            case 5:
               System.out.println("Exiting the program...");
               break;
            default:
               System.out.println("Invalid choice. Try again.");
               break;
         }
      } while (choice != 5);
      sc.close();
   }
}
