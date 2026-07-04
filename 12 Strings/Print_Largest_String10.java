public class Print_Largest_String10 {
    public static void main(String arg[]){
        String fruits[] = {"apply","mango","banana"};

        String largest = fruits[0];
        for (int i=0 ; i<fruits.length ; i++){
            if (largest.compareTo(fruits[i])< 0){
                largest = fruits[i];

            }


        }
        System.out.println(largest);
    }
    
}
