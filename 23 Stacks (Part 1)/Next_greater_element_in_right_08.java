import java.util.Stack;

public class Next_greater_element_in_right_08{
    public static void main(String arg[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length -1 ; i>=0 ; i--){
            // Step -> 1: while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // Step -> 2: if else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s.peek()];
            }

            // Step -> 3: push in s
            s.push(i);

        }

        for(int i = 0 ; i<nxtGreater.length ; i++){
            System.out.print(nxtGreater[i]+" ");
        }
        
        // Same type problem 
        // Next Greater right
        // Next Greater left
        // Next Smaller right
        // Next Smaller left
    }
    
}
