import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        float pencil_price = sc.nextFloat();
        float pen_price = sc.nextFloat();
        float ereser_price = sc.nextFloat();

        float total_price = pen_price + pencil_price + ereser_price;

        float total_pric_w_gst = total_price + (total_price * (18/100));

        System.out.println(total_pric_w_gst);

        sc.close();
    }
    
}
