import java.util.ArrayList;

public class Size_of_ArrayList_03{
        public static void main(String arg[]){

        ArrayList<Integer> list = new ArrayList<>();
   

        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        
        // print the ArrayList
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }

    }
    
}