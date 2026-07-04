public class Problem01{
    public static void main(String arg[]){
        int n = 6;
        for (int line = 1; line<=n;line++){
            for (int star = 1 ; star<=n+1;star++){
                if (line==n){
                    System.out.print("*");
                }
                else if (line==1){
                    System.out.print("*");
                }
                else if (line<n && star==1){
                    System.out.print("*");
                }
                else if (line<n && star ==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}