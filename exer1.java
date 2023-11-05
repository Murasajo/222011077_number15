public class exer1 {
    public static void main(String[] args){
        int playerHealth = 100;
        while (playerHealth > 0){
            System.out.println("Player health: "+ playerHealth);
            playerHealth -=10;
        }
        System.out.println("Game Over");

    }
}
