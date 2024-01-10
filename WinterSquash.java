import java.util.Date;


public class WinterSquash extends Veggie {
    public WinterSquash(Date expiryDate) {
        super("WinterSquash", expiryDate);
    }

    @Override
    public String getRecipe() {
        // Accessing the central recipe repository
        Recipe recipe = RecipeBook.getRecipe("Winter Squash Soup");
        if (recipe != null) {
            return recipe.toString();
        } else {
            return "No recipe found for Winter Squash.";
        }
    }
}
