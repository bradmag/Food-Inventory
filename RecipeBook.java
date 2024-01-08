import java.util.HashMap;
import java.util.Map;
import java.util.List;

class RecipeBook {
    private static Map<String, Recipe> recipes = new HashMap<>();

    // Static initializer to pre-load recipes
    static {
        // Define and add recipes here

        //Potato Leek Soup
        List<Ingredient> potatoLeekSoupIngredients = List.of(
            new Ingredient("Potato", "3 cups Diced (Idealy Yukon Gold)"),
            new Ingredient("Leek", "3 Cleaned and Sliced (Light green and white parts)"),
            new Ingredient("Chicken broth", "1 quart"),
            new Ingredient("Half and Half", "1 pint"),
            new Ingredient("Butter", "4 tablespoons"),
            new Ingredient("Herbs", "(Bay leaves, Thyme, Rosemarry)"),
            new Ingredient("Salt and Pepper", "To Taste"));
        List<String> potatoLeekSoupSteps = List.of(
            "Add the Leeks and butter to a large soup pot.",
            "Cook on medeum stirring regularly so it doesn't brown.",
            "When the Leeks are soft, add the potatoes, broth, herbs, salt and pepper.",
            "Bring to a boil, reduce to a simmer, cover and cook until potatoes are soft (about 15 min).",
            "Pull the herbs out, add the half and half, then blend.",
            "If the soup is too thin, simmer. If the soup is too thick, add chicken broth or water.");

        recipes.put("Potato Leek Soup", new Recipe("Potato Leek Soup", potatoLeekSoupIngredients, potatoLeekSoupSteps));
        


        //Butter Basted Meat
        List<Ingredient> butterBastedMeatIngredients = List.of(
            new Ingredient("Meat", "Steak, Pork or Chicken"),
            new Ingredient("Cooking oil", "1 tablespoon per portion of meat"),
            new Ingredient("Butter", "1 tablespoon per portion of meat"),
            new Ingredient("Herbs", "Rosemarry, Thyme, Garlic"),
            new Ingredient("Salt and Pepper", "1 teaspoon per portion of meat"));
        List<String> butterBastedMeatSteps = List.of(
            "Season the meat with salt and pepper, then let rest at room temperature for 30 min",
            "Heat a cast Iron skillet on high until smoking.",
            "Add the oil and spread on bottom of pan.",
            "Carefully place meat (away from you) on the pan. You should be able to hear it.",
            "Sear on one side until bottom gets a nice char.",
            "add herbs and flip meat",
            "Add butter and reduce heat to medeum-high",
            "Baste until desired temp",
            "to properly butter baste, tilt the pan so butter drains to bottom, then use a large spoon to coat each peace of meat",
            "Tilt the pan so you can scoop the butter but then put the pan back on the heat to keep it hot.",
            "When desired temp, let rest for 10 minutes.");

        recipes.put("Butter Basted Meat", new Recipe("Butter Basted Meat", butterBastedMeatIngredients, butterBastedMeatSteps));
        
        // Add more recipes as needed
    }

    public static void addRecipe(Recipe recipe) {
        recipes.put(recipe.name, recipe);
    }

    public static Recipe getRecipe(String name) {
        return recipes.get(name);
    }
}
