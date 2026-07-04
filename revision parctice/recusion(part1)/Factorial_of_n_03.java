public class Factorial_of_n_03{
    public static void main(String arg[]){
        System.out.println("Factorial of n : "+factorialOfN(5));
        System.out.println("Sum of n natural number : "+calcuSum(5));

        System.out.println("fibonacci of nth number : "+fib(25));

        int array[] = {1,2,3,5,4};
        System.out.println("Is array Sorted : "+isSorted(array,0));

        int array1[] = {8,3,6,9,5,10,2,5,3};
        System.out.println("The first occurence of key in array1 is at index : "+firstOccurence(array1,5,0));
        
        int array2[] = {5,5,5,5};
        System.out.println("The last occurence of the key in the array2 is at index : "+lastOccurence(array2,5,0));
        
        System.out.println(power(2,10));

        System.out.println(optimizedPower(2,5));
    }

    public static int factorialOfN(int n){
        if(n==0){
            return 1;
        }

        int fnm1 = factorialOfN(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int calcuSum(int n){
        if (n==1){
            return 1;
        }
        int Snm1 = calcuSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    // Calculate nth fibonacci number
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int array[], int i){
        if(i == array.length-1){
            return true;
        }

        if(array[i]>array[i+1]){
            return false;
        }

        return isSorted(array,i+1);
    }

    public static int firstOccurence(int array1[] , int key , int i){
        if(i == array1.length){
            return -1;
        }

        if (array1[i] == key){
            return i;
        }

        return firstOccurence(array1,key,i+1);
    }

    public static int lastOccurence(int array2[], int key ,int i){
        if (i==array2.length){
            return -1;
        }

        int isFound = lastOccurence(array2,key,i+1);

        if(isFound == -1 && array2[i]==key){
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n){
        if (n==1){
            return x;
        }

        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedPower(int x , int n){
        if (n==1){
            return x;
        }

        int halfPower = optimizedPower(x,n/2);
        int halfPowerSquare = halfPower * halfPower;

        //n is odd
        if(n%2 != 0){
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;
    }

}