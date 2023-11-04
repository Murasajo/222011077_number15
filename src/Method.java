public class Method {
    public static int AddNumbers(int num1, int num2){
        return num1+num2;
    }
    
    public static void main(String[] args) {
        int number1 = 13;
        int number2 = 5;

        int result = AddNumbers(number1,number2);

        System.out.println("The sum of "+ number1 + " and " + number2 + " is: " + result);
    }
}
