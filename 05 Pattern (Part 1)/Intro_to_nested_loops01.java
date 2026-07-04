public class Intro_to_nested_loops01{
    public static void main(String arg[]){
        for (int line = 1 ;line<=4;line++){
            for (int star = 1 ;star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}