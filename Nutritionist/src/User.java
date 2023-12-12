import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String username;
    private String password;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private List<String> dietaryPreferences;
    private List<String> allergies;

    public User(String userID, String username, String password, int age, String gender, double weight, double height) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.dietaryPreferences = new ArrayList<>();
        this.allergies = new ArrayList<>();
    }


    public void addDietaryPreference(String preference) {
        dietaryPreferences.add(preference);
    }

    public void addAllergy(String allergy) {
        allergies.add(allergy);
    }

	public List<String> getAllergies() {
		return allergies;
	}
	
	
	/*public void updatePassword(String newPassword) {
        this.password = newPassword;
    }*/
}
