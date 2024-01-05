import java.util.Date;


public class Potato extends Veggie {
    public Potato(Date expiryDate) {
        super("Potato", expiryDate); // Name is set as "Potato"
    }

    @Override
    public String getRecipe() {
        return "Mashed, Baked, Fries, Air Fried";
    }
}
