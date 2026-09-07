import java.util.*;

public class Activity_Selection_unsorted_endTime_02{
    public static void main(String arg[]){
        int startTime[] = {1,3,0,5,8,5};
        int endTime[] = {2,4,6,7,9,9};

        // Sorting
        int activities[][] = new int[startTime.length][3];
        for(int i=0 ; i<startTime.length ; i++){
            activities[i][0] = i;
            activities[i][1] = startTime[i];
            activities[i][2] = endTime[i];
        }

        // lamda function ---> shortform
        Arrays.sort(activities,Comparator.comparingDouble(a -> a[2]));

        // End time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        // first Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int prevEndTime = activities[0][2];

        for(int i=1 ; i<startTime.length ; i++){
            if(activities[i][1] >= prevEndTime){
                // Activity select
                maxAct++;
                ans.add(activities[i][0]);
                prevEndTime = activities[i][2];
            }
        }


        System.out.println("Maximum activities : "+maxAct);

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        }



    }
}