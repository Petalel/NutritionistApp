import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  User user = new User("123", "john_doe", "password", 25, "Male", 70.0, 175.0);
		        user.addDietaryPreference("Vegetarian");
		        user.addAllergy("Nuts");
	
		        FoodItem apple = new FoodItem("001", "Apple", new Nutrients(95, 0.5, 25, 0.3), 1.0);
		        FoodItem chickenBreast = new FoodItem("002", "Chicken Breast", new Nutrients(165, 31, 0, 3.6), 100.0);
	
		        Meal lunch = new Meal("L001", "Lunch", System.currentTimeMillis());
		        lunch.addFoodItem(apple);
		        lunch.addFoodItem(chickenBreast);
	
		        NutritionPlan nutritionPlan = new NutritionPlan("NP001", 2000, System.currentTimeMillis(), System.currentTimeMillis() + 86400000); // 1 day
	
		        Recipe saladRecipe = new Recipe("R001", "Mixed Salad", Arrays.asList(apple), Arrays.asList("Wash vegetables", "Mix ingredients"));
		        Recipe chickenRecipe = new Recipe("R002", "Grilled Chicken", Arrays.asList(chickenBreast), Arrays.asList("Season chicken", "Grill for 15 minutes"));
	
		        nutritionPlan.addMeal(lunch);
		}
	
	}









