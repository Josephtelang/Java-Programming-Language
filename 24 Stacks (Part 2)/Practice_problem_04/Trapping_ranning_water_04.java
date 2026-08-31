package Practice_problem_04;
import java.util.Stack;

public class Trapping_ranning_water_04 {
    public static int totalTrappedWater(int arr[]){
        Stack<Integer> leftMax = new Stack<>();
        Stack<Integer> reversedRightMax = new Stack<>();
        
        // left heighest
        for(int i=0 ; i<arr.length ; i++){
            if(leftMax.isEmpty()){
                leftMax.push(arr[i]);
            }
            else if (leftMax.peek() >= arr[i]){
                leftMax.push(leftMax.peek());
            }
            else{
                leftMax.push(arr[i]);
            }
        }

        // right heighest
        for(int i = arr.length-1 ; i>= 0 ; i--){
            if(reversedRightMax.isEmpty()){
                reversedRightMax.push(arr[i]);
            }
            else if (reversedRightMax.peek() >= arr[i]){
                reversedRightMax.push(reversedRightMax.peek());
            }
            else{
                reversedRightMax.push(arr[i]);
            }
        }

        Stack<Integer> rightMax = new Stack<>();
        while(!reversedRightMax.isEmpty()){
            rightMax.push(reversedRightMax.pop());
        }
        int totalWaterTrapped = 0;
        for(int i=0 ; i<arr.length ; i++ ){
            int trappedAtCurBar = Math.min(leftMax.pop(),rightMax.pop()) - arr[i];
            totalWaterTrapped  = trappedAtCurBar + totalWaterTrapped;

        }

        return totalWaterTrapped;
    }

    public static int monotonicStackApproch(int arr[]){
        Stack<Integer> monotonicStack = new Stack<>();
        int bottomIdx = 0;
        int leftMaxIdx = 0;
        int rightMaxIdx = 0;
        int totalTrappedWater = 0;
        for(int i=0 ; i<arr.length ; i++){
            while(!monotonicStack.isEmpty() && arr[monotonicStack.peek()] < arr[i]){
                bottomIdx = monotonicStack.pop();
                if(monotonicStack.isEmpty()){
                    continue;
                }
                leftMaxIdx = monotonicStack.peek();
                rightMaxIdx = i;
                int width = rightMaxIdx - leftMaxIdx - 1;
                int waterTrappedAtBottom =  (Math.min(arr[leftMaxIdx],arr[rightMaxIdx]) - arr[bottomIdx]) * width;
                totalTrappedWater = waterTrappedAtBottom + totalTrappedWater;
            }
            
            monotonicStack.push(i);
            
        }

        return totalTrappedWater;
    }
    public static void main(String arg[]){
        int arr[] = {2,5};
        System.out.println(totalTrappedWater(arr));
        System.out.println(monotonicStackApproch(arr));
    }
    
}
