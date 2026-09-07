import java.util.Arrays;

public class Maximum_length_chain_of_pairs_05 {
    public static void main(String arg[]){  // O(n logn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, (pair1,pair2) -> Double.compare(pair1[1],pair2[1]));
        
        int chainEnd = pairs[0][1];  // Last selected pair end  Or // chain end
        int chainLen = 1;

        for(int i=1 ; i<pairs.length ; i++){
            if(pairs[i][0] > chainEnd){
                chainEnd = pairs[i][1];
                chainLen++;
            }
        }

        System.out.println("Maximum length of chain is : "+chainLen);

    }
    
}
