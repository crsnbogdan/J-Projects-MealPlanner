import java.util.Scanner;

public class Utility {
    private Utility() {
    }
    public static String validateInput(Scanner scanner, String prompt, String invalidInput, String[] expectedInput) {
        System.out.println(prompt);
        String validatedInput = "";
        while (true) {
            String userInput = scanner.nextLine();
            boolean validInput = false;

            if (expectedInput.length > 0) {
                for (String input : expectedInput) {
                    if (input.equals(userInput)) {
                        validatedInput = userInput;
                        validInput = true;
                        break;
                    }
                }
                if (validInput) {
                    return validatedInput;
                } else {
                    System.out.println(invalidInput);
                }
            } else {
                if (userInput.length() >= 3) {
                    return userInput;
                } else {
                    System.out.println("Input too short. Please make sure your input is longer than 2 characters.");
                }
            }
        }
    }
}
