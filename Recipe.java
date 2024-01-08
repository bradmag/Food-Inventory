import java.util.List;

class Recipe {
    String name;
    List<Ingredient> ingredients;
    List<String> steps; // List to store the steps for preparing the recipe

    public Recipe(String name, List<Ingredient> ingredients, List<String> steps) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    // Method to print the process of the recipe
    public void printProcess() {
        System.out.println("Steps to prepare " + name + ":");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println((i + 1) + ". " + steps.get(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(name + "\nIngredients:\n");
        
        // Append each ingredient to the StringBuilder
        for (int i = 0; i < ingredients.size(); i++) {
            result.append((i + 1)).append(". ").append(ingredients.get(i)).append("\n");
        }

        result.append("\nProcess:\n");
        // Append each step to the StringBuilder
        for (int i = 0; i < steps.size(); i++) {
            result.append((i + 1)).append(". ").append(steps.get(i)).append("\n");
        }
    return result.toString();
    }
}
