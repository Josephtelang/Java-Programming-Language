public class Pair_of_an_Array09 {
    public static void pair_of_an_array(int number[]){
        int tpc = 0;
        for (int i = 0 ; i < number.length;i++){
            int curr = number[i];
            for (int j = i+1 ; j < number.length ; j++){
                System.out.print("("+curr+","+number[j]+") ");
                tpc ++;

            }
            System.out.println();
        }
        System.out.print("Total number of pairs : "+tpc);
    }
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10};
        pair_of_an_array(numbers);
    }
    
}
