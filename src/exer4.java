public class exer4 {
    public static void main(String[] args) {
        int playerHealth = 100;

        for (int i = 0; i < 10; i++) { // Outer loop to simulate 10 iterations
            for (int j = 0; j < 10; j++) { // Inner loop to simulate 10 sub-iterations
                System.out.println("Player health: " + playerHealth);
                playerHealth -= 10;
            }
        }

        System.out.println("Game Over");
    }
}

