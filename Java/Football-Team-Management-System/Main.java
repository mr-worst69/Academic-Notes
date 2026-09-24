import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using interface reference and TeamManagement object
        PlayerOperation team = new TeamManagement();

        int choice;

        do {

            System.out.println("\n===== Football Team Management System =====");
            System.out.println("1. Add Player");
            System.out.println("2. Search Player by ID");
            System.out.println("3. Search Player by Name");
            System.out.println("4. Delete Player");
            System.out.println("5. Display All Players");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    team.addPlayer();
                    break;

                case 2:
                    System.out.print("Enter Player ID: ");
                    int id = sc.nextInt();
                    team.searchPlayer(id);
                    break;

                case 3:
                    sc.nextLine();

                    System.out.print("Enter Player Name: ");
                    String name = sc.nextLine();

                    team.searchPlayer(name);
                    break;

                case 4:
                    team.deletePlayer();
                    break;

                case 5:
                    team.displayPlayers();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");

            }

        } while (choice != 6);


        sc.close();

    }
}
