import java.util.Comparator;
// A Comparator for Food items that compares them based on their expiry dates
public class FoodComparator implements Comparator<Food> {
    @Override
    public int compare(Food f1, Food f2) {
        return f1.expiryDate.compareTo(f2.expiryDate); // Compare based on expiryDate
    }
}
