public class Assign1 {
    // Method to calculate simple interest
    public static int Sinterest (int Pr, int T, int R ){
        return (Pr*T*R)/100; 
    }


        public static void main(String[] args){
            // Creating an instance of the Assign1 class
            Assign1 Mysimpleinterest = new Assign1();
            
            int result = Mysimpleinterest.Sinterest(100000,5,5);

            // Displaying the result
            System.out.println("My simple interest: " + result);
        }

      
}
