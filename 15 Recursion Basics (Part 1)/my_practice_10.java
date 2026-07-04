import java.util.*;

public class my_practice_10 {
    public static void printDecreasing(int n){
        if(n<1){
            return;
        }
        System.out.println(n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // printIncreasing(n);

        // System.out.println(PrintFact(n));

        // System.out.println(SumNatural(n));

        // System.out.println(PrintFibonacci(n));

        int arr[] = {1,2,5,3,4,5};

        // System.out.println(isSorted(arr,0));

        // System.out.println(last_occr(arr,0,5));

        // System.out.println(x_toPower_n(2, 10));

        System.out.println(1/2);

        System.out.println(opti_x_toPower_n(2, 5));

    }
    public static void printIncreasing(int n){
        if(n<1){
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
        

        
    }
    public static int PrintFact(int n){
        if ( n == 0){
            return 1;
        }
        int fnm1 = PrintFact(n-1);
        int fn = n * fnm1;

        return fn;
    }

    public static int SumNatural(int n){
        if (n == 0 ){
            return 0;
        }

        return n + SumNatural(n-1);
    }
     
    public static int PrintFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = PrintFibonacci(n-1);
        int fnm2 = PrintFibonacci(n-2);
        return fnm1 + fnm2;
    }

    public static boolean isSorted(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if ( arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }

    public static int first_occr(int arr[],int i,int key){
        if (i>arr.length-1){
            return -1;
        }
        if ( arr[i]== key){
            return i;
        }

        return first_occr(arr,i+1,key);
    }

    public static int last_occr(int arr[],int i,int key){
        if (i> arr.length-1){
            return -1;
        }

        int is_found = last_occr(arr, i+1, key);

        if (is_found == -1 && arr[i] == key){
            return i;
        }

        return is_found;
    }

    public static int x_toPower_n(int x , int n){
        if (n==0 ){
            return 1;
        }

        return x * x_toPower_n(x, n-1);


    }

    public static int opti_x_toPower_n(int x,int n){
        if (n==0){
            return 1;
        }

        int half_power = opti_x_toPower_n(x, n/2);
        int half_power_sq = half_power* half_power;

        if (n%2!=0){
            return x * half_power_sq;
        }

        return half_power_sq;

    }
}
