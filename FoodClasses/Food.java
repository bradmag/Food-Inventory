import java.util.Date;

public class Food {
    String name;
    Date expiryDate;

    public Food(String name, Date expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getRecipe() {
        // Placeholder for recipe. Override this in subclasses for specific recipes.
        return "Recipe for " + name;
    }

    @Override
    public String toString() {
        return name + " (Expires on: " + expiryDate + ")";
    }
}
