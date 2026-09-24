public class Player extends Person {

    // Encapsulation: Player specific data
    private int playerId;
    private String position;
    private int jerseyNumber;
    private int goals;


    // Constructor
    public Player(int playerId, String name, int age, String phone,
                  String position, int jerseyNumber, int goals) {

        super(name, age, phone);
        // Calling parent class constructor

        this.playerId = playerId;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.goals = goals;

    }


    // Getter method
    public int getPlayerId() {

        return playerId;

    }


    public String getPosition() {

        return position;

    }


    public int getJerseyNumber() {

        return jerseyNumber;

    }


    public int getGoals() {

        return goals;

    }


    // Method Overriding
    @Override
    public void displayInfo() {

        System.out.println("\nPlayer ID: " + playerId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone: " + getPhone());
        System.out.println("Position: " + position);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Goals: " + goals);

    }

}
