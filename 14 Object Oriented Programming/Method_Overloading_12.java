public class Method_Overloading_12 {
    public static void main(String arg[]){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1.5f,2.5f));
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.sum(2,2.5f));
        System.out.println(c1.sum(3.5f,3));

    }
    


    
}

class Calculator{
    int sum(int a , int b){
        return a + b;

    }

    float sum(float a , float b){
        return a + b;
    }

    int sum(int a , int b ,int c){
        return a + b + c;
    }

    float sum(int a , float b){
        return a+b;
    }

    float sum(float a , int b){
        return a+b;
    }
}
