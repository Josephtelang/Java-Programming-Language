import java.util.*;

public class Job_sequencing_using_greedy_08 {
    static class Job{
        int id;
        int deadline;
        int profit;

        Job(int i, int d, int p){
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }

    }
    public static void main(String arg[]){
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        
        ArrayList<Job> Jobs = new ArrayList<>();
        for(int i=0 ; i<jobInfo.length ; i++){
            Jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(Jobs,(Job1,Job2) -> Job2.profit - Job1.profit); // sort in descending order
        int maxDeadline = Collections.max(Jobs,(Job1,Job2) -> Job1.deadline - Job2.deadline).deadline;
        boolean slots[] = new boolean[maxDeadline+1];
        
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i=0 ; i<Jobs.size() ; i++){
            Job currJob = Jobs.get(i);
            for(int j=currJob.deadline ; j>0 ; j--){
                if(!slots[j]){
                    seq.add(currJob.id);
                    slots[j] = true;
                    break;
                }
            }

        }

        System.out.println("Maximum Jobs you can do : "+seq.size());
        for(int i=0 ;i<seq.size() ; i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    
}
