import java.util.*;

public class Javainput_area {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float pi = 3.14f;

        float area = pi*radius*radius;

        System.out.println(area);

        sc.close();
    }
}
