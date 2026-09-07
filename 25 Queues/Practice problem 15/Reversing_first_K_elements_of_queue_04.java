import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;


public class Reversing_first_K_elements_of_queue_04 {
    public static Queue<Integer> reversFirstK(Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();
        Queue<Integer> remainQ = new ArrayDeque<>();

        while(!q.isEmpty()){
            if(k > 0){
                s.push(q.remove());
                k--;
                continue;
            }

            remainQ.add(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!remainQ.isEmpty()){
            q.add(remainQ.remove());
        }

        return q;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first K elements you have to revers from Queue :");
        int k = sc.nextInt();
        Queue<Integer> q = new ArrayDeque();
        int arr[] = {10, 20, 30, 40, 50, 60, 70,80, 90, 100};
        for(int i : arr){
            q.add(i);
        }
        Queue resultQ = reversFirstK(q, k);

        while(!resultQ.isEmpty()){
            System.out.print(resultQ.remove()+" ");
        }

    }
    
}
