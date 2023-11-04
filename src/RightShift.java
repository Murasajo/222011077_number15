public class RightShift {
    public static void main(String args[])
    {  
        System.out.println(10>>2);  
        System.out.println(20>>2);
        System.out.println(20>>3); 
        
         //For positive number, >> and >>> works same  
        System.out.println(20>>2);  
        System.out.println(20>>>2);  
        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2); 
    }
}  
