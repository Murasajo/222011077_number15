public class Assign1 {
    public static int Sinterest (int Pr, int T, int R ){
        return (Pr*T*R)/100; 
    }


        public static void main(String[] args){
            Assign1 Mysimpleinterest = new Assign1();

            int result = Mysimpleinterest.Sinterest(100000,5,5);

            System.out.println("My simple interest: " + result);
        }

      
}
