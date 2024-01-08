class Ingredient {
    String name;
    String quantity; // e.g., "1 cup", "200g", etc.

    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - " + quantity;
    }
}
