import java.util.ArrayList;
import java.util.List;

public class NutritionPlan {
    private String planID;
    private List<Meal> meals;
    private double totalCalories;
    private double targetCalories;
    private long startDateTime;
    private long endDateTime;

    public NutritionPlan(String planID, double targetCalories, long startDateTime, long endDateTime) {
        this.planID = planID;
        this.targetCalories = targetCalories;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.meals = new ArrayList<>();
    }


    public void addMeal(Meal meal) {
        meals.add(meal);
        totalCalories += meal.getTotalCalories();
    }
}