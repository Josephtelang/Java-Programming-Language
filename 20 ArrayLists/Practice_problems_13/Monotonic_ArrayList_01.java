package Practice_problems_13;
import java.util.ArrayList;

public class Monotonic_ArrayList_01 {
    public static boolean isMonotonic(ArrayList<Integer> list ){
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0 ; i<list.size()-1; i++){
            if(list.get(i) < list.get(i+1)){
                decreasing = false;
            }
            if(list.get(i) > list.get(i+1)){
                increasing = false;
            }


        }

        

        return increasing || decreasing;

        
    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);

        System.out.println(isMonotonic(list));

    }
    
}
