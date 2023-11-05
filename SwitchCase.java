public class SwitchCase {
    public static void main(String args[])
    {
        String career = "software developer";

        switch (career){
            
            case "Data scientists":
            System.out.println("He is professional data scientists");
            break;

            case "software developer":
            System.out.println("He is software developer and IT consultant");
            break;

            case "Data engineer":
            System.out.println("He is a data engineer professional");
            break;

            default:
            System.out.println("He is not an IT expert");
        }

    }
}
