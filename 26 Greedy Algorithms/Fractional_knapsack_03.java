import java.util.*;
public class Fractional_knapsack_03 {
    public static void main(String arg[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        // col 0 -> index and col 1 -> ratio
        for(int i=0 ; i<ratio.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,(ratio1,ratio2) -> Double.compare(ratio2[1], ratio1[1]));

        int capacity = w;
        double finalVal = 0;

        for(int i=0 ; i<ratio.length ;i++){
            int idx = (int)ratio[i][0];
            if(weight[idx] <= capacity){  // include full item
                finalVal += value[idx];
                capacity -= weight[idx];
            }
            else{  // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;

            }
        }

        System.out.println("Maximum value : "+finalVal);


    }
    
}
