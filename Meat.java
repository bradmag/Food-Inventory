import java.util.Date;

public class Meat extends Food {
    public Meat(String name, Date expiryDate) {
        super(name, expiryDate);
    }

    @Override
    public String getRecipe() {
        return "Sear and butter baste the " + name;
    }
}
