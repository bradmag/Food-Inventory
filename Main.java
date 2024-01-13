import java.util.Date;


public class Main {

    public static void main(String[] args) throws Exception {

        // Create Instances of the various classes
        Meat porkChop = new Meat("PorkChop", new Date(2023, 5, 15));
        Veggie asparagus = new Veggie("Asparagus", new Date(2024, 7, 10));
        Potato potato = new Potato(new Date(2023, 9, 5));
        Onion onion = new Onion(new Date(2023, 2, 5));
        WinterSquash winterSquash = new WinterSquash(new Date(2023, 1, 2));


        // Create a Food Queue and test the methods
        // Create a new ShoppingList for groceries (needed for FoodQueue)
        ShoppingList groceries = new ShoppingList();
        // Create a PriorityQueue(FoodQueue) with the custom comparator and methods for Food items
        FoodQueue foodQueue = new FoodQueue(groceries);

        // Add food items to the queue
        // Note: Using deprecated Date constructor for simplicity 
        // To-Do: consider using java.time.LocalDate in real applications
        foodQueue.add(new Fruit("Apple", new Date(2024, 12, 10))); 
        foodQueue.add(new Fruit("Banana", new Date(2024, 12, 15)));
        foodQueue.add(porkChop);
        foodQueue.add(asparagus);
        foodQueue.add(potato);
        foodQueue.add(onion);
        foodQueue.add(winterSquash);

        System.out.println("FoodQueue before removal:");
        foodQueue.printQueue();
    
        
        // Test the readNextRecipe() method from the FoodQueue class
        // Test that the Food Classes can call the recipes in the Hash Map
        System.out.println("\n***Test the readNextRecipe() method from the FoodQueue class***\n");
        System.out.println("Next recipe in your list:\n" + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());

        System.out.println("\nNext recipe in your list:\n" + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());

        System.out.println("\nNext recipe in your list:\n" + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());

        System.out.println("\nNext recipe in your list: " + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());
        
        System.out.println("\nNext recipe in your list: " + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());

        System.out.println("\nNext recipe in your list: " + foodQueue.readNextRecipe());
        System.out.println("Removing " + foodQueue.poll());

        foodQueue.printQueue();

        // Test that the items get added to the grocery list after getting poll'd from the foodQueue
        System.out.println("\n***Testing that Items get added to Groceries when poll'd from the queue***\n");
        groceries.printList();
    }
}
