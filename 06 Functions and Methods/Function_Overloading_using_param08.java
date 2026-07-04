public class Function_Overloading_using_param08 {

    //function to do sum of two numbers
    public static int sum(int a, int b){
        return a+b;
    }

    //funcion to do sum of three numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String arg[]){

        System.out.println(sum(5,5));
        System.out.println(sum(3,4,2));

    }
    
}
