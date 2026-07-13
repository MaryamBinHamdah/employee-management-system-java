import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creating Arrays
        String[] ID = new String[2];
        String[] Name = new String[2];
        Double[] Commission = new Double[2];

        int option;
        int i = 0;

        do {
            // Displaying Menu options
            System.out.println("\nChoose an option:");
            System.out.println("1. Add new employee");
            System.out.println("2. Search for employee");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    // Adding New Employees
                    System.out.print("Enter employee ID: ");
                    ID[i] = scanner.nextLine();

                    System.out.print("Enter employee name: ");
                    Name[i] = scanner.nextLine();

                    System.out.print("Enter employee commission: ");
                    Commission[i] = scanner.nextDouble();

                    System.out.println("Employee details added successfully! \n");
                    i++;
                    break;
                case 2:
                    // Searching for Employees
                    System.out.print("Enter employee ID to search: ");
                    String searchID = scanner.nextLine();

                    boolean found = false;

                    for (int m = 0; m < ID.length; m++) {
                        if (ID[m].equals(searchID)) {
                            System.out.println("Employee found:");
                            System.out.println("Name: " + Name[m]);
                            System.out.println("Commission: AED " + Commission[m]);
                            found = true;
                            break; // exit loop once found
                        }
                    }
                    if (!found) {
                        System.out.println("Error: Employee not found.");
                    }
                    break;
                case 3:
                    // Exit
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            // End Switch
        } while (option != 3); // End Loop
    }
}
