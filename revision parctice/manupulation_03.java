public class manupulation_03 {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("the number is Even!");
        }
        else{
            System.out.println("the number is Odd!");
        }

    }
    public static int get_ith_bit(int n , int i ){
        int bitmask = 1<<i;

        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String arg[]){
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(12);

        // System.out.println(getIthBit(10,2));
        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,1,0));
        


        // System.out.println(clearLastIbits(15,2));
        // System.out.println(clearBitsInRange(10,2,4));
        // System.out.println(isPowerOfTwo(16));

        // System.out.println(countSetBits(15));
        System.out.println(fastExponentiation(5,3));

        
    }
    public static int getIthBit(int n , int i ){
        int bitmask = 1<<i;
        return (n & bitmask)>>i;

        
    }
    public static int setIthBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    
    public static int updateIthBit(int n ,  int i , int newBit){
        // if (newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }

        //                   Or
        n = clearIthBit(n,i);
        int bitmask = newBit << i;

        return n | bitmask;
    }

    public static int clearLastIbits(int n, int i){
        int bitmask = -1 << i;
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i , int j){
        int a = ~0 << j+1;
        int b = (1<<i) -1;
        int bitmask = a|b;
        return n & bitmask ;
    }

    public static boolean isPowerOfTwo(int n){
        if (n>0){
            return (n & (n-1))== 0 ;
        }
        return false;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n!=0){
            if((n & 1) != 0){
                count ++;
            }
          
            n=n >>> 1;
        }
        return count;
    }

    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n!=0){
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
            
        }
        return ans;
    }

}
