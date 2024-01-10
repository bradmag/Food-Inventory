import java.util.HashMap;
import java.util.Map;
import java.util.List;

class RecipeBook {
    private static Map<String, Recipe> recipes = new HashMap<>();

    // Static initializer to pre-load recipes
    static {
        // Veggie Recipes

        // French Onion Soup
         List<Ingredient> frenchOnionSoupIngredients = List.of(
            new Ingredient("Onion", "4 Peeled and sliced"),
            new Ingredient("Beef Broth", "2 quart"),
            new Ingredient("White Wine", "1 cup"),
            new Ingredient("Sherry Wine", "2 tablespoon"),
            new Ingredient("All-purpose Flour", "1 tablespoon"),
            new Ingredient("Butter", "4 tablespoons"),
            new Ingredient("Gruyere", "1-2 cups"),
            new Ingredient("Salt and Pepper", "To Taste"));
        List<String> frenchOnionSoupSteps = List.of(
            "Add the Onions salt and butter to a large soup pot (Dutch Oven).",
            "Cook on medeum stirring regularly so it Caramelizes.",
            "This will take about 45 - 60 minutes.",
            "If the bottom of the pan gets too dark, turn down the heat then put a dash of water in and stirr to deglaze.",
            "Meanwhile heat the beef broth in a small pot.",
            "When the onions are done add the wine and bring to a boil.",
            "Add the flour and mix in for a minute.",
            "Add the warm broth to the onion mixture and boil for 10 minutes.",
            "Season to taste.",
            "When serving put a piece of bread on each bowl, cover with gruyere and broil until melted.");

        recipes.put("French Onion Soup", new Recipe("French Onion Soup", frenchOnionSoupIngredients, frenchOnionSoupSteps));


        // Potato Leek Soup
        List<Ingredient> potatoLeekSoupIngredients = List.of(
            new Ingredient("Potato", "3 cups Diced (Idealy Yukon Gold)"),
            new Ingredient("Leek", "3 Cleaned and Sliced (Light green and white parts)"),
            new Ingredient("Chicken broth", "1 quart"),
            new Ingredient("Half and Half", "1 pint"),
            new Ingredient("Butter", "4 tablespoons"),
            new Ingredient("Herbs", "(Bay leaves, Thyme, Rosemarry)"),
            new Ingredient("Salt and Pepper", "To Taste"));
        List<String> potatoLeekSoupSteps = List.of(
            "Add the Leeks and butter to a large soup pot (Dutch Oven).",
            "Cook on medeum stirring regularly so it doesn't brown.",
            "When the Leeks are soft, add the potatoes, broth, herbs, salt and pepper.",
            "Bring to a boil, reduce to a simmer, cover and cook until potatoes are soft (about 15 min).",
            "Pull the herbs out, add the half and half, then blend.",
            "If the soup is too thin, simmer. If the soup is too thick, add chicken broth or water.");
        recipes.put("Potato Leek Soup", new Recipe("Potato Leek Soup", potatoLeekSoupIngredients, potatoLeekSoupSteps));
        
        // Winter Squash soup
        List<Ingredient> winterSquashSoupIngredients = List.of(
            new Ingredient("Winter Squash (Butternut)", "2 to 3 pounds, peeled, seeded, and cubed"),
            new Ingredient("Onion", "1, peeled and diced"),
            new Ingredient("Garlic", "2 cloves, minced"),
            new Ingredient("Carrot", "1, peeled and diced"),
            new Ingredient("Apple", "1, peeled, cored, and diced"),
            new Ingredient("Chicken or Vegetable Broth", "4 cups"),
            new Ingredient("Coconut Milk or Half and Half", "1 cup"),
            new Ingredient("Olive Oil or Butter", "2 tablespoons"),
            new Ingredient("Ground Ginger", "1 teaspoon"),
            new Ingredient("Ground Cinnamon", "1/2 teaspoon"),
            new Ingredient("Salt and Pepper", "to taste"));
        List<String> winterSquashSoupSteps = List.of(
            "Sauté onions and carrots in olive oil or butter until onions are translucent.",
            "Add garlic and cook for another minute.",
            "Add cubed squash and diced apple to the pot; stir.",
            "Pour in the broth and add ginger, cinnamon, salt, and pepper.",
            "Bring to a boil, then simmer for 20-30 minutes until squash and carrots are tender.",
            "Puree the soup using an immersion blender or regular blender.",
            "Stir in coconut milk or half and half and warm through.",
            "Taste and adjust seasonings as needed.",
            "Serve hot, garnished with optional toppings.");
        recipes.put("Winter Squash Soup",new Recipe("Winter Squash Soup", winterSquashSoupIngredients, winterSquashSoupSteps));

        // Meat Recipes

        // Butter Basted Meat
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
