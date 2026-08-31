import java.util.ArrayList;

public class Pair_sum1_11 {
    public static boolean pairSum1(ArrayList<Integer> list,int target ){
        // brute force 
        for(int i=0 ; i<list.size() ; i++){
            for(int j = i+1 ; j<list.size() ;j++){
                int pairSum = list.get(i) + list.get(j);
                if(pairSum == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum1TwoPointer(ArrayList<Integer> list,int target ){
        // two pointer
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            // Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            // Case 2
            else if(list.get(lp) + list.get(rp)< target){
                lp++;
            }
            // Case 3
            else{
                rp--;
            }
        }

        return false;
    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list,target));
        System.out.println(pairSum1TwoPointer(list,target));

    }
    
}
