import java.util.Date;

public class Food {
    String name;
    Date expiryDate;

    public Food(String name, Date expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public void eat() {
        System.out.println("Yum! food is good!");
    }

    @Override
    public String toString() {
        return name + " (Expires on: " + expiryDate + ")";
    }
}
