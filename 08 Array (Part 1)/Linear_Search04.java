public class Linear_Search04 {
    public static int linear_search(int numbers[],int key){
        for (int i = 0; i<numbers.length ; i++ ){
            if (numbers[i] == key){
                return i;
            }
            
        }
        return-1;
    }
    public static void main(String arg[]){
        int numbers[] = {1,3,5,6,10,13,15,16,18};
        int key = 10;

        int index = linear_search(numbers,key);

        

        if (index == -1){
            System.out.println("Key does not exist");
        }
        else{
            System.out.println("The index of key is : "+index);
        }



    }
    
}
