public class Nutrients {
    private double calories;
    private double protein;
    private double carbs;
    private double fat;

    public Nutrients(double calories, double protein, double carbs, double fat) {
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

	public double getFat() {
		return fat;
	}

	public double getCarbs() {
		return carbs;
	}

	public double getProtein() {
		return protein;
	}

	public double getCalories() {
		return calories;
	}

	
}