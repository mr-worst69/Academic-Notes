import java.util.ArrayList;
import java.util.Scanner;


public class TeamManagement implements PlayerOperation {

    // Store all Player objects
    private ArrayList<Player> teamPlayers;


    // Constructor: initialize ArrayList
    public TeamManagement() {

        teamPlayers = new ArrayList<>();

    }


    @Override
    public void addPlayer() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Position: ");
        String position = sc.nextLine();

        System.out.print("Enter Jersey Number: ");
        int jerseyNumber = sc.nextInt();

        System.out.print("Enter Goals: ");
        int goals = sc.nextInt();


        try {

            validatePlayerData(id, age, goals);


            Player p = new Player(
                    id,
                    name,
                    age,
                    phone,
                    position,
                    jerseyNumber,
                    goals
            );


            teamPlayers.add(p);

            System.out.println("Player added successfully!");

        }

        catch (InvalidPlayerException e) {

            System.out.println(e.getMessage());

        }

    }



    @Override
    public void searchPlayer(int id) {


        for(Player p : teamPlayers) {


            if(p.getPlayerId() == id) {

                p.displayInfo();
                return;

            }

        }


        System.out.println("Player not found!");

    }



    @Override
    public void searchPlayer(String name) {


        for(Player p : teamPlayers) {


            if(p.getName().equalsIgnoreCase(name)) {

                p.displayInfo();
                return;

            }

        }


        System.out.println("Player not found!");

    }



    @Override
    public void deletePlayer() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player ID to delete: ");
        int id = sc.nextInt();


        for(Player p : teamPlayers) {


            if(p.getPlayerId() == id) {

                teamPlayers.remove(p);

                System.out.println("Player deleted successfully!");
                return;

            }

        }


        System.out.println("Player not found!");

    }



    @Override
    public void displayPlayers() {


        if(teamPlayers.isEmpty()) {

            System.out.println("No players available!");

            return;

        }


        for(Player p : teamPlayers) {

            p.displayInfo();

        }

    }



    // Data validation method
    private void validatePlayerData(int id, int age, int goals)
            throws InvalidPlayerException {


        if(id <= 0) {

            throw new InvalidPlayerException("Invalid Player ID!");

        }


        if(age <= 0) {

            throw new InvalidPlayerException("Invalid Age!");

        }


        if(goals < 0) {

            throw new InvalidPlayerException("Invalid Goals!");

        }

    }

}
