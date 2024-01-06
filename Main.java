import java.util.Date;

import javax.xml.transform.Source;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create Instances of the various classes
        Food chicken = new Meat("Chicken", new Date(2023, 7, 15));
        Food carrot = new Veggie("Carrot", new Date(2023, 8, 10));
        Food potato = new Potato(new Date(2023, 9, 5));
        Food steak = new Food("Steak", new Date(2023, 9, 5));

        Meat PorkChop = new Meat("PorkChop", new Date(2023, 5, 15));
        Veggie Asparagus = new Veggie("Asparagus", new Date(2023, 7, 10));
        Potato Potato2 = new Potato(new Date(2023, 9, 5));

        // //Test the toString() method
        // System.out.println("\n***Testing toString() and getRecipe() methods***\n");
        // System.out.println(chicken);
        // System.out.println(carrot);
        // System.out.println(potato);

        // // Test the getRecipe() method
        // System.out.println("\nFood type");
        // System.out.println(steak.getRecipe());
        // System.out.println(chicken.getRecipe());
        // System.out.println(carrot.getRecipe());
        // System.out.println(potato.getRecipe());

        // System.out.println("\nSpecific type");
        // System.out.println(PorkChop.getRecipe());
        // System.out.println(Asparagus.getRecipe());
        // System.out.println(SweetPotato.getRecipe());



        // Create a Food Queue and test the methods

        // Create a new ShoppingList for groceries
        ShoppingList groceries = new ShoppingList();

        // Create a PriorityQueue(FoodQueue) with the custom comparator and methods for Food items
        FoodQueue foodQueue = new FoodQueue(groceries);

        // Add food items to the queue
        // Note: Using deprecated Date constructor for simplicity; consider using java.time.LocalDate in real applications
        foodQueue.add(new Food("Apple", new Date(2023, 12, 10))); // Food item with its expiry date
        foodQueue.add(new Food("Banana", new Date(2023, 12, 15)));
        foodQueue.add(new Food("Beet", new Date(2023, 12, 12)));
        foodQueue.add(chicken);
        foodQueue.add(PorkChop);
        foodQueue.add(carrot);
        foodQueue.add(Asparagus);
        foodQueue.add(potato);

        // Test that the Queue is prioritizing the items
        System.out.println("\n***Test that FoodQueue is priotitizing objects***\n");
        
        // Test the printQueue() method
        System.out.println("\n***Test the printQueue() method***\n");
        System.out.println("FoodQueue before removal:");
        foodQueue.printQueue();
    
        
        // Test the readNextRecipe() method from the FoodQueue class
        System.out.println("\n***Test the readNextRecipe() method***\n");
        System.out.println("Next recipe in your list: " + foodQueue.readNextRecipe());
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
