import java.util.ArrayList;
import java.util.Collections;

public class Sorting_an_ArrayList_07 {
        public static void main(String arg[]){

        ArrayList<Integer> list = new ArrayList<>();
   

        list.add(2); // O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);

        // by default ascending order -> n log(n)
        Collections.sort(list);
        System.out.println(list);

        // descending order -> n log(n)
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
    
    
}
