import java.util.Scanner;

public class Meal {
    private String mealType = "";
    private String mealName = "";
    private String[] mealIngredients;
    private boolean mealSaved = false;

    private void setMealType (String type) {
        mealType = type;
    }
    private void setMealName (String name) {
        mealName = name;
    }
    private void setMealIngredients (String ingredients) {
        mealIngredients = ingredients.split(", ");

    }
    public void getMeal () {
        System.out.println("Category: " + mealType +";  name: " + mealName + "; ");

        String ingredients = "Ingredients: ";
        for(String mealIngredient: mealIngredients) {
            ingredients += mealIngredient + " ";
        }
        System.out.println(ingredients);
        System.out.println();
    }


    public void initializeMeal(Scanner scanner) {
        setMealType(Utility.validateInput(scanner, "Which meal do you want to add (breakfast, lunch, dinner)?", "Invalid meal type. Please input one of the following: breakfast, lunch, dinner.", new String[]{"breakfast", "lunch", "dinner"}));
        setMealName(Utility.validateInput(scanner, "Please input the meal's name.", "", new String[]{}));
        setMealIngredients(Utility.validateInput(scanner, "Please input the ingredients.", "", new String[]{}));
    }



}
