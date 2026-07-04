package Chapter04hw;
// How many times 'Hello' is printed?

public class Problem01 {
    public static void main(String arg[]){
        int counter = 1;
        for (int i = 0;i<5;i++){
            System.out.println("Hello World "+counter+"th time");
            counter ++;
            i += 2;
        }
    }
    
}
