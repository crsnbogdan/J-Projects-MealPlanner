import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MealManager {
    private MealManager() {};

    private static ArrayList<Meal> mealArrayList = new ArrayList<>();

    public static void getMeals() {
        for(Meal meal : mealArrayList) {
            meal.getMeal();
        }
    }

    public static void run(Scanner scanner) {
        while (true){
            String input = Utility.validateInput(scanner, "Would you like to create a meal (yes, no)?", "Invalid input. Please input one of the following: yes, no.", new String[]{"yes", "no"});
            if(input.equals("yes")) {
                makeMeal(scanner);
            } else if(input.equals("no")) {
                getMeals();
                System.out.println("Thank you. Goodbye.");
                return;
            }
        }
    }

    private static void makeMeal(Scanner scanner) {
        Meal meal = new Meal();
        meal.initializeMeal(scanner);
        String saveMeal = (Utility.validateInput(scanner, "Do you want to save this meal?", "Invalid meal type. Please input one of the following: yes, no.", new String[]{"yes", "no"}));
        if(saveMeal.equals("yes")) {
            mealArrayList.add(meal);
        }
    }

}
