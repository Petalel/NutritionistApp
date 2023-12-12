import java.util.ArrayList;
import java.util.List;

public class FoodItem {
    private String foodID;
    private String name;
    private Nutrients nutrients;
    private double servingSize;
    private List<String> allergens;

    public FoodItem(String foodID, String name, Nutrients nutrients, double servingSize) {
        this.foodID = foodID;
        this.name = name;
        this.nutrients = nutrients;
        this.servingSize = servingSize;
        this.allergens = new ArrayList<>();
    }


    public boolean checkAllergens(User user) {
        return user.getAllergies().containsAll(allergens);
    }

	public Nutrients getNutrients() {
		return nutrients;
	}


	public String getName() {
		return name;
	}
}