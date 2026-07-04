import java.util.*;

// Question1: Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
// with separate methods for each operation who sereal and imaginary parts are entered by the user.
 
public class Problem01 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real number");
        int r_num = sc.nextInt();
        System.out.println("Enter the imaginary number");
        int i_num = sc.nextInt();


        Complex com= new Complex(r_num,i_num);
        System.out.println("Enter the real number");
        int r_num1 = sc.nextInt();
        System.out.println("Enter the imaginary number");
        int i_num2 = sc.nextInt();

        Complex com1 = new Complex(r_num1,i_num2);

        Complex sum = com.sum(com1);
        Complex product  = com.product(com1);
        Complex substract = com.substract(com1);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(substract);



    }
    
}

class Complex{
    int r_num ;
    int i_num ; 
    Complex(int r_num,int i_num){
        this.r_num = r_num;
        this.i_num = i_num;

    }


    Complex sum(Complex other){

        return new Complex(this.r_num + other.r_num , this.i_num + other.i_num) ;
    }

    Complex substract(Complex other){
        return new Complex(this.r_num - other.r_num , this.i_num - other.i_num);
    }

    Complex product(Complex other){
        int r_num = (this.r_num * other.r_num) - (this.i_num * other.i_num);
        int i_num = (this.r_num * other.i_num) + (this.i_num * other.r_num);
        return new Complex(r_num  , i_num);
    }


    public String toString(){
        if (i_num >= 0){
            return r_num +"+ i"+i_num;

        }
        else{
            return r_num +"- i"+-i_num;
        }
    }



}

