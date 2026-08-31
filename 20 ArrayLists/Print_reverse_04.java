import java.util.ArrayList;

public class Print_reverse_04 {
    public static void main(String arg[]){

        ArrayList<Integer> list = new ArrayList<>();
   

        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        
        // print reverse ArrayList --> O(n)
        for (int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i)+" ");
        }
        

    }

    
}
