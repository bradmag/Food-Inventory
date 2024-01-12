import java.util.Date;

public class Meat extends Food {
    public Meat(String name, Date expiryDate) {
        super(name, expiryDate);
    }

    @Override
    public String getRecipe() {
        Recipe recipe = RecipeBook.getRecipe("Butter Basted Meat");
        if (recipe != null) {
            return recipe.toString();
        } else {
            return "No recipe found for Meat.";
        }
    }
}

