import java.util.ArrayList;

public class Activity_Selection_sorted_endTime_01 {
    public static void main(String arg[]){   // O(n)
        int startTime[] = {1,3,0,5,8,5};
        int endTime[] = {2,4,6,7,9,9};

        // End time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        // first Activity
        maxAct = 1;
        ans.add(0);
        int prevEndTime = endTime[0];

        for(int i=1 ; i<startTime.length ; i++){
            if(startTime[i] >= prevEndTime){
                // Activity select
                maxAct++;
                ans.add(i);
                prevEndTime = endTime[i];
            }
        }


        System.out.println("Maximum activities : "+maxAct);

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        }


    }
    
}
