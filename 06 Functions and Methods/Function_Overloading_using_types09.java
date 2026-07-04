public class Function_Overloading_using_types09 {

    //Function sum of two integers 
    public static int sum(int a , int b){
        return a + b;
    }

    //Function sum of two float
    public static float sum(float a ,float b){
        return a + b;
    }
    public static void main(String arg[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));

    }
    
}
