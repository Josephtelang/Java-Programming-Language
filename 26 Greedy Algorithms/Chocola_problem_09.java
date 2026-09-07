import java.util.*;

public class Chocola_problem_09 {
    public static void main(String arg[]){
        // int  m = 6 , n = 4 ;
        Integer costVer[] = {2,1,3,1,4}; // m - 1
        Integer costHor[] = {4,1,2}; // n - 1
        
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        
        int vC = 0 , hC = 0;
        int vPs = 1 , hPs = 1;

        int cost = 0;
        while(vC < costVer.length && hC < costHor.length ){
            if(costVer[vC] <= costHor[hC]){
                cost += (costHor[hC] * vPs);
                hC++;
                hPs++;
            }
            else{
                cost += (costVer[vC] * hPs);
                vC++;
                vPs++;
            }
        }

        while(vC < costVer.length){
            cost += (costVer[vC] * hPs);
            vC++;
            vPs++;
        }

        while(hC < costHor.length){
            cost += (costHor[hC] * vPs);
            hC++;
            hPs++;
        }

        System.out.println("mini cost used for cutting : "+cost);
    }
    
}
