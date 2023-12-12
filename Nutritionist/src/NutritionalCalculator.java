
public class NutritionalCalculator {
	public double calculateTotal(Nutrients nutrients) {
        return nutrients.getCalories() + nutrients.getProtein() + nutrients.getCarbs() + nutrients.getFat();
    }
}
