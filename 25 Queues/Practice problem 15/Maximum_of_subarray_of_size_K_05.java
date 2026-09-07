import java.util.*;

public class Maximum_of_subarray_of_size_K_05 {
    static class Pair{
        int value;
        int idx;

        Pair(int value, int idx){
            this.value = value;
            this.idx = idx;
        }
    }

    public static void brouteForce(int arr[],int k){
        for(int i=0 ;i<arr.length - k + 1 ; i++){
            int maxEle = arr[i];
            for(int j = i ; j < i + k ; j++){
                maxEle = Math.max(maxEle,arr[j]);

            }
            System.out.print(maxEle+" ");
        }
        System.out.println();
    }
    public static void MaximumOfSubarrayOfSizeK_Using_PriQ(ArrayList<Pair> arrList  , int k){
        PriorityQueue<Pair> priQ = new PriorityQueue<>((arrList1,arrList2) -> arrList2.value - arrList1.value);

        for(int i = 0 ; i<k ; i++){
            priQ.add(arrList.get(i));
        }
        System.out.print(priQ.peek().value+" ");

        for(int i=k ; i<arrList.size(); i++){
            int windowStartIdx = i - k + 1;
            priQ.add(arrList.get(i));
            while(!priQ.isEmpty() && priQ.peek().idx < windowStartIdx){
                priQ.poll();
            }
            System.out.print(priQ.peek().value+" ");

        }
        System.out.println();

    }

    public static void MaximumOfSubarrayOfSizeK_Optimized_using_Deque(int arr[],int k){
        Deque<Integer> indexDq = new ArrayDeque<>();
        for(int i=0 ; i<arr.length ; i++){
            int windowLastIdx = i;
            while(!indexDq.isEmpty() && arr[indexDq.peekLast()] < arr[windowLastIdx]){
                indexDq.removeLast();
            }

            indexDq.add(windowLastIdx);
                
            int windowStartIdx = i-k+1;
            while(!indexDq.isEmpty() && indexDq.peekFirst() < windowStartIdx ){
                indexDq.removeFirst();
            }
            
            if(i >= k-1){
                System.out.print(arr[indexDq.peekFirst()]+" ");
            }
        }
    }
    public static void main(String arg[]){
        int arr[] = {1 ,2 ,3 ,1 ,4 , 5, 2, 3, 6};
        ArrayList<Pair> arrList = new ArrayList<>();
        Pair a = new Pair(1, 0);
        Pair b = new Pair(2, 1);
        Pair c = new Pair(3, 2);
        Pair d = new Pair(1, 3);
        Pair e = new Pair(4, 4);
        Pair f = new Pair(5, 5);
        Pair g = new Pair(2, 6);
        Pair h = new Pair(3, 7);
        Pair i = new Pair(6, 8);

        arrList.add(a);
        arrList.add(b);
        arrList.add(c);
        arrList.add(d);
        arrList.add(e);
        arrList.add(f);
        arrList.add(g);
        arrList.add(h);
        arrList.add(i);
    

        brouteForce(arr, 3);
        MaximumOfSubarrayOfSizeK_Using_PriQ(arrList, 3);
        MaximumOfSubarrayOfSizeK_Optimized_using_Deque(arr, 3);

    }
    
}
