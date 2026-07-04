public class Problem02 {
    public static void main(String arg[]){
        String var = " ";
        int n = 4;
        for (int line = 1; line<=n; line++){
            for (int star = 1; star <= line; star++){
                for (int space = 1 ; space <=n-line;space++){
                    System.out.print(var);

                }
            System.out.print("*");
            var = "";
            }
        var = " ";
        System.out.println();

        }
    }
    
}

