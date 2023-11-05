import java.util.Arrays;

public class exer2 {
    public static void main(String[] args) {
        String[] storeCart = {"Milkshake", "Fresh juice", "Soda", "Coffee"};
        String userChoice;
        boolean continueOrdering = true;

        while (continueOrdering) {
            do {
                System.out.println("What do you want? (y/n)");
                userChoice = System.console().readLine();

                if (!userChoice.equals("y") && !userChoice.equals("n")) {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            } while (!userChoice.equals("y") && !userChoice.equals("n"));

            if (userChoice.equals("n")) {
                continueOrdering = false;
            } else {
                System.out.println("Which item from the storecart do you want to order? (Milkshake, Fresh juice, Soda, Coffee)");
                userChoice = System.console().readLine();

                if (Arrays.asList(storeCart).contains(userChoice)) {
                    System.out.println("You have ordered " + userChoice + ".");
                } else {
                    System.out.println("Invalid item. Please enter a valid item from the storecart.");
                }
            }
        }
        
    }
}

