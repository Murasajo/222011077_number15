public class exer3 {
    public static void main(String[] args) {
        int playerHealth = 100;

        while (playerHealth > 0) {
            System.out.println("Player health: " + playerHealth);
            playerHealth -= 10;

            if (playerHealth <= 30) {
                System.out.println("Player's health is critically low. The game is ending.");
                break;
            }
        }

        System.out.println("Game Over");
    }
}

