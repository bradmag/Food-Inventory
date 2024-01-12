import java.util.Date;


public class Carrot extends Veggie {
    public Carrot(Date expiryDate) {
        super("Carrot", expiryDate);
    }

    @Override
    public String getRecipe() {
        // Accessing the central recipe repository
        Recipe recipe = RecipeBook.getRecipe("Carrot Ginger Soup");
        if (recipe != null) {
            return recipe.toString();
        } else {
            return "No recipe found for carrot.";
        }
    }
}
