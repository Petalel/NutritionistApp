import java.util.ArrayList;
import java.util.List;

public class Meal {
    private String mealID;
    private String mealName;
    private List<FoodItem> foodItems;
    private double totalCalories;
    private long timestamp;

    public Meal(String mealID, String mealName, long timestamp) {
        this.mealID = mealID;
        this.mealName = mealName;
        this.timestamp = timestamp;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
        updateTotalCalories(foodItem);
    }

    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
        updateTotalCalories(foodItem);
    }

    private void updateTotalCalories(FoodItem foodItem) {
        totalCalories += foodItem.getNutrients().getCalories();
    }

    public double getTotalCalories() {
		return totalCalories;
	}
}