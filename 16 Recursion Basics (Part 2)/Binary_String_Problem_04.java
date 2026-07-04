public class Binary_String_Problem_04 {
    public static void printBinaryString(int n , int last_place , String str){
        if ( n ==0 ){
            System.out.println(str);
            return;
        }

        // if(last_place == 0){
        //     // sit 0 on chair n
        //     printBinaryString(n-1, 0, str +"0");
        //     printBinaryString(n-1, 1, str +"1");
        // }
        // else{
        //     printBinaryString(n-1, 0, str +"0");

        // }

        printBinaryString(n-1, 0, str +"0");
        if(last_place == 0){
            printBinaryString(n-1, 1, str + "1");
        }
    }
    public static void main(String arg[]){
        printBinaryString(3,0, "");
    }
    
}
