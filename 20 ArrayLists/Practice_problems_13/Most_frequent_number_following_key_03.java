package Practice_problems_13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Most_frequent_number_following_key_03 {
    public static int mostFrequentNumberFollowingKeyWrongSolution(ArrayList<Integer> list , int key){ // for Some cases
        int occurenceCount = 0;
        int target = 0;
        int iterator = 0;
        for(int i=0 ; i<list.size()-1 ; i++){
            if(key == list.get(i) ){
                target = list.get(i+1);
                occurenceCount++;
                break;
            }
            iterator++;
        }

        for(int j=iterator ; j<list.size()-1;j++){
            if(key == list.get(j)){
                if(target != list.get(j+1)){
                    occurenceCount--;
                    if(occurenceCount==-1){
                        target = list.get(j+1);
                        occurenceCount++;

                    }
                }
                
            }

        }

        return target;
    }
    public static int mostFrequentNumberFollowingKeyRealSolution(ArrayList<Integer> list , int key){
        ArrayList<Integer> frequenceList = new ArrayList<>();
        ArrayList<Integer> targetList = new ArrayList<>();
        int currTarget = 0;
        int frequence;


        for(int i=0 ; i<list.size()-1; i++){
            
            if(key != list.get(i)){
                continue;
            }
            currTarget = list.get(i+1) ;
            if(targetList.contains(currTarget)){
                continue;
            }
            frequence = 1;
            for(int j=i+1; j<list.size()-1; j++ ){
                if(key == list.get(j) && currTarget == list.get(j+1)){
                    frequence++;
                    
                }
            }
            

            frequenceList.add(frequence);
            targetList.add(currTarget);
            
        }

        int maxFreq = Collections.max(frequenceList);
        int maxFreqIndex = frequenceList.indexOf(maxFreq);
        return targetList.get(maxFreqIndex);
    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,100,200,1,100));
        // list.add(9);
        // list.add(1);
        // list.add(5);
        // list.add(9);
        // list.add(2);
        // list.add(9);
        // list.add(3);
        // list.add(9  );
        // list.add(5);
        // list.add(9);
        // list.add(5);
        System.out.println(mostFrequentNumberFollowingKeyWrongSolution(list, 1));
        System.out.println(mostFrequentNumberFollowingKeyRealSolution(list, 1));
    }
    
}
