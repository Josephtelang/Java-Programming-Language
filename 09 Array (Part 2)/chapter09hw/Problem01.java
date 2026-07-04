public class Problem01{

    public static boolean repitative_number(int num[]){
        int n = num.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (num[i]==num[j]){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String arg[]){
        int nums_1[] = {1, 2, 3, 1};

        int nums_2[] = {1, 2, 3, 4};

        int nums_3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.print("It is "+repitative_number(nums_3)+" statement that numbers are repitative in this array");

        


    }
}