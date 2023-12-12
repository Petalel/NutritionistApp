import java.util.ArrayList;
import java.util.List;

// Meal Class
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
        totalCalories += foodItem.getNutrients().getCalories();
    }

    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);	
        totalCalories += foodItem.getNutrients().getCalories();
    }
    
	public double getTotalCalories() {
		return totalCalories;
	}
	
	 /* public void printMealDetails() {
	        System.out.println("Meal ID: " + mealID);
	        System.out.println("Meal Name: " + mealName);
	        System.out.println("Timestamp: " + timestamp);
	        System.out.println("Food Items:");
	        for (FoodItem foodItem : foodItems) {
	            System.out.println("- " + foodItem.getName());
	        }
	        System.out.println("Total Calories: " + totalCalories);
	    }*/
	
	/* public double calculateAverageServingSize() {
        if (foodItems.isEmpty()) {
            return 0.0;
        }

        double totalServingSize = 0;
        for (FoodItem foodItem : foodItems) {
            totalServingSize += foodItem.getServingSize();
        }

        return totalServingSize / foodItems.size();
    }*/
}