import java.util.PriorityQueue;

// Priority queue that will use the food comparator to prioritize what food will go bad first
class FoodQueue {
    private PriorityQueue<Food> queue;
    private ShoppingList shoppingList;

    public FoodQueue(ShoppingList shoppingList) {
        this.queue = new PriorityQueue<>(new FoodComparator());
        this.shoppingList = shoppingList;
    }

    public void add(Food item) {
        queue.add(item);
    }

    public Food poll() {
        Food item = queue.poll();
        if (item != null) {
            shoppingList.addItem(item.name);
        }
        return item;
    }

    // Method to read the recipe for the next item without deleting it
    public String readNextRecipe() {
        Food nextItem = queue.peek();
        return (nextItem != null) ? nextItem.getRecipe() : "No more items in the queue.";
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to print the entire queue without modifying.
    public void printQueue() {
        // Create a temporary queue to avoid modifying the original queue
        PriorityQueue<Food> tempQueue = new PriorityQueue<>(queue);

        System.out.println("Food items in priority order:");
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll());
        }
    }
}
