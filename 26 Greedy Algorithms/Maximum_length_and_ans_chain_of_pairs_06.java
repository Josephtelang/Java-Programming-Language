import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_length_and_ans_chain_of_pairs_06 {
    public static void main(String arg[]){  // O(n logn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        int pairsWithIdx[][] = new int[pairs.length][pairs[0].length+1];
        for(int i=0 ; i<pairs.length ; i++){
            pairsWithIdx[i][0] = i;
            pairsWithIdx[i][1] = pairs[i][0];
            pairsWithIdx[i][2] = pairs[i][1];
        }

        Arrays.sort(pairsWithIdx, (pair1,pair2) -> Double.compare(pair1[2],pair2[2]));
        
        ArrayList<int[]> finalChain = new ArrayList<>();
        int chainEnd = pairsWithIdx[0][2];  // Last selected pair end  Or // chain end
        int chainLen = 1;
        finalChain.add(pairs[pairsWithIdx[0][0]]);  // is equal to finalChain.add(new {2,24}) so we don't need to declare inner arrays(int[]) length 

        for(int i=1 ; i<pairsWithIdx.length ; i++){
            if(pairsWithIdx[i][1] > chainEnd){
                chainEnd = pairsWithIdx[i][2];
                finalChain.add(pairs[pairsWithIdx[i][0]]);
                chainLen++;
            }
        }

        System.out.println("Maximum length of chain is : "+chainLen);
        for(int i=0 ; i<finalChain.size() ; i++){
            System.out.print(Arrays.toString(finalChain.get(i)));
        }

    }
    
}
