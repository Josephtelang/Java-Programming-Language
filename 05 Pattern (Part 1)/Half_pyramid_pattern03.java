public class Half_pyramid_pattern03{
    public static void main(String arg[]){
        int n = 7;

        for (int line = 1; line<=n;line++){
            for (int number = 1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}