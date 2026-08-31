import java.util.ArrayList;
import java.util.Collections;

public class Job_sequencing_problem_03 {
    static class Job{
        char id;
        int deadline;
        int profit;

        Job(char id , int deadline , int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static int JobSequencingProblem(ArrayList<Job> jobs){
        Collections.sort(jobs,(job1,job2) -> job2.profit - job1.profit);
        // int maxDeadline = Integer.MIN_VALUE;
        // for(int i = 0 ; i<jobs.size() ; i++){
        //     maxDeadline = Math.max(maxDeadline,jobs.get(i).deadline);
        // }
                                        // Or

        int maxDeadline = Collections.max(jobs,(job1,job2) -> job1.deadline - job2.deadline).deadline;

        int maxProfit = 0;

        boolean slots[] = new boolean[maxDeadline + 1];
        for(int i=0 ;i<jobs.size() ; i++){
            Job currJob = jobs.get(i);
            int deadline = currJob.deadline;
            while(deadline>0){
                if(!slots[deadline]){
                    slots[deadline] = true;
                    maxProfit = maxProfit + currJob.profit;
                    System.out.println(currJob.id);
                    break;
                }
                deadline--;
            }
        }
        System.out.println();

        return maxProfit;
    }
    public static void main(String arg[]){
        ArrayList<Job> jobs = new ArrayList<>();
        Job a = new Job('a', 4, 20);
        Job b = new Job('b', 1, 10);
        Job c = new Job('c', 1, 40);
        Job d = new Job('d', 1, 30);
        jobs.add(a);
        jobs.add(b);
        jobs.add(c);
        jobs.add(d);
        System.out.println("maximum profit : "+JobSequencingProblem(jobs));
        
    }
    
}
