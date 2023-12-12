
public class Food {
    private String name;
    private int calories;
    private double protein;
    private double carbohydrates;
    private double fat;

    public Food(String name, int calories, double protein, double carbohydrates, double fat) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
    }


    @Override
    public String toString() {
        return String.format("%s (Calories: %d, Protein: %.2fg, Carbs: %.2fg, Fat: %.2fg)",
                name, calories, protein, carbohydrates, fat);
    }
}
