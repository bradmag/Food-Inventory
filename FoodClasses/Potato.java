import java.util.Date;


public class Potato extends Veggie {
    public Potato(Date expiryDate) {
        super("Potato", expiryDate); // Name is set as "Potato"
    }

   @Override
    public String getRecipe() {
        // Accessing the central recipe repository
        Recipe recipe = RecipeBook.getRecipe("Potato Leek Soup");
        if (recipe != null) {
            return recipe.toString();
        } else {
            return "No recipe found for Potato.";
        }
    }
}
