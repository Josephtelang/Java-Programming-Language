package Practice_problems_13;
import java.util.ArrayList;
import java.util.Collections;

public class Lonely_numbers_in_ArrayList_02 {
    public static ArrayList<Integer> lonelyNumberInArrayList(ArrayList<Integer> list ){
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0 ; i<list.size(); i++){
            int x = list.get(i);
            int before_x = x-1;
            int after_x = x+1;
            boolean adjecentExists = false;
            for(int j=0 ; j<list.size(); j++){
                if(i==j ){
                    continue;
                }
                else if (list.get(j) == before_x || list.get(j) == after_x || list.get(j)== x){
                    adjecentExists = true;
                }
                
            }
            if(adjecentExists == false){
                result.add(list.get(i));
            }
        }

        return result;
    }

    public static ArrayList<Integer> lonelyNumberInArrayListOptimized(ArrayList<Integer> list ){
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(list);
        boolean adjecentExists = false;
        boolean sameNumber = false;
        for(int i=0 ; i<list.size()-1; i++){
            if(list.get(i) == list.get(i+1) ){
                sameNumber = true;
                continue;
            }
            else if(list.get(i) + 1 == list.get(i+1)){
                adjecentExists = true;
                continue;
            }
            else if(adjecentExists || sameNumber){ // is previout adjecent this checks it
                adjecentExists = false;
                sameNumber = false;
                continue;
            }

            result.add(list.get(i));


        }
        if(adjecentExists || sameNumber ){
            return result;
        }
        result.add(list.get(list.size()-1));

        return result;

    }
    public static ArrayList<Integer> lonelyNumberInArrayListOptimized2(ArrayList<Integer> list ){
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(list);
        int n = list.size();
 
        if(n==1){
            result.add(list.get(0));
            return result;
        }
        for(int i=0 ; i<n; i++){
            int current = list.get(i);
            if(i==0){
                int next = list.get(i+1);
                if(current != next && current + 1 != next){
                    result.add(current);
                }
                continue;
            }
            int prev = list.get(i-1);
            if(i== n-1){
                if(current != prev && current - 1 != prev){
                    result.add(current);
                }
                continue;
            }
            int next = list.get(i+1);
            if( current != prev && current != next && current - 1 != prev && current + 1 != next  ){
                result.add(current);

            
            }

        }

        
        

        return result;

    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);

        System.out.println(lonelyNumberInArrayList(list));
        System.out.println(lonelyNumberInArrayListOptimized(list));
        System.out.println(lonelyNumberInArrayListOptimized2(list));


    }
    
}
