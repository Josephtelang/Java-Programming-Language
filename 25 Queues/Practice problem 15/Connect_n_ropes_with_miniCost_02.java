
import java.util.*;

public class Connect_n_ropes_with_miniCost_02 {
    public static void connectN_Rope_With_Mini_Cost(int arr[]){

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            arrList.add(arr[i]);
        }
        int miniCost = 0;
        while(arrList.size() > 1){
            Collections.sort(arrList);
            int newRope = arrList.remove(0) + arrList.remove(0);
            
            arrList.add(newRope);

            miniCost = miniCost + newRope;



        }

        System.out.println(miniCost);
    }

    public static void connectN_Rope_With_Mini_Cost_Optimized(int arr[]){
        PriorityQueue<Integer> priQ = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            priQ.add(arr[i]);
        }
        int miniCost = 0;
        while(priQ.size() > 1){
            int newRope = priQ.remove() + priQ.remove();

            miniCost = miniCost + newRope;

            priQ.add(newRope);


        }

        System.out.println(miniCost);
    }
    public static void main(String arg[]){
        int arr[] = {4,3,2,6};
        connectN_Rope_With_Mini_Cost(arr);

        connectN_Rope_With_Mini_Cost_Optimized(arr);
        
    }
    
}
