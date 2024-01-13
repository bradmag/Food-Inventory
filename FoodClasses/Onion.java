import java.util.Date;


public class Onion extends Veggie {
    public Onion(Date expiryDate) {
        super("Onion", expiryDate);
    }

    @Override
    public String getRecipe() {
        // Accessing the central recipe repository
        Recipe recipe = RecipeBook.getRecipe("French Onion Soup");
        if (recipe != null) {
            return recipe.toString();
        } else {
            return "No recipe found for Onion.";
        }
    }
}
