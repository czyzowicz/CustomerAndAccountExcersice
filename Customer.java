package CustomerAndAccountExcersice;

public class Customer {
    private int id;
    private String name;
    private Gender gender;

    public Customer(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                "gender= " + gender +
                "name=" + name +'}';
    }
}
