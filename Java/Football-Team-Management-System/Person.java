public abstract class Person {

    // Encapsulation: private variables
    private String name;
    private int age;
    private String phone;


    // Constructor
    public Person(String name, int age, String phone) {

        this.name = name;
        this.age = age;
        this.phone = phone;

    }


    // Getter methods
    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    public String getPhone() {

        return phone;

    }


    // Abstract method
    public abstract void displayInfo();

}
