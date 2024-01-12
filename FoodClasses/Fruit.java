import java.util.Date;

public class Fruit extends Food {
    public Fruit(String name, Date expiryDate) {
        super(name, expiryDate);
    }

    @Override
    public String getRecipe() {
        return "Try eating the " + name + " as it is.";
    }
}
