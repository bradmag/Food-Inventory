import java.util.Date;

public class Veggie extends Food {
    public Veggie(String name, Date expiryDate) {
        super(name, expiryDate);
    }

    @Override
    public String getRecipe() {
        return "Try Air-Frying the " + name;
    }
}
