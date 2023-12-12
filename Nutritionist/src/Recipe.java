import java.util.List;

public class Recipe {
    private String recipeID;
    private String name;
    private List<FoodItem> ingredients;
    private List<String> preparationSteps;
    private Nutrients nutritionalInfo;

    public Recipe(String recipeID, String name, List<FoodItem> ingredients, List<String> preparationSteps) {
        this.recipeID = recipeID;
        this.name = name;
        this.ingredients = ingredients;
        this.preparationSteps = preparationSteps;

        this.nutritionalInfo = calculateTotalNutritionalInfo();
    }


    private Nutrients calculateTotalNutritionalInfo() {
        double totalCalories = 0;
        double totalProtein = 0;
        double totalCarbs = 0;
        double totalFat = 0;

        for (FoodItem ingredient : ingredients) {
            Nutrients nutrients = ingredient.getNutrients();
            totalCalories += nutrients.getCalories();
            totalProtein += nutrients.getProtein();
            totalCarbs += nutrients.getCarbs();
            totalFat += nutrients.getFat();
        }

        return new Nutrients(totalCalories, totalProtein, totalCarbs, totalFat);
    }
    /*
    public void printRecipeDetails() {
        System.out.println("Recipe ID: " + recipeID);
        System.out.println("Recipe Name: " + name);
        System.out.println("Ingredients:");
        for (FoodItem ingredient : ingredients) {
            System.out.println("- " + ingredient.getName());
        }
        System.out.println("Preparation Steps:");
        for (String step : preparationSteps) {
            System.out.println("- " + step);
        }
        System.out.println("Nutritional Information:");
        System.out.println("- Calories: " + nutritionalInfo.getCalories());
        System.out.println("- Protein: " + nutritionalInfo.getProtein());
        System.out.println("- Carbs: " + nutritionalInfo.getCarbs());
        System.out.println("- Fat: " + nutritionalInfo.getFat());
    }*/
}