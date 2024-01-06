import java.util.List;
import java.util.ArrayList;

class ShoppingList {
    private List<String> items;

    public ShoppingList() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void printList() {
        System.out.println("Shopping List:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
