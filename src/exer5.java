public class exer5 {
    public static void main(String args[])
    {
        String team = "premier league";
        String cup = "champions cup";

        if (team == "premier league" && cup!="champions cup"){
            System.out.println("The team belongs to premier league but it doesn't have champions cup ");
        
        }

        else if (team != "premier league" && cup=="champions cup"){
            System.out.println("the team doesn't belong to premier league but has champions cup");
        }

        else  if (team == "premier league" && cup =="champions cup"){
            System.out.println("The team belongs to premier league and have champions cup ");
        }

        else {
            System.out.println("Neither belongs to premier league nor have champions cup");
        }

    }
}
