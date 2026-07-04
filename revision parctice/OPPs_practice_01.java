import java.util.*;

public class OPPs_practice_01 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part for obj1 : ");
        int real_part_obj1 = sc.nextInt();
        System.out.print("enter the imaginary part for obj1  : ");
        int imginary_part_obj1 = sc.nextInt();
        System.out.print("Enter the real part obj2 : ");
        int real_part_obj2 = sc.nextInt();
        System.out.print("enter the imaginary part obj2 : ");
        int imginary_part_obj2 = sc.nextInt();

        Complexity obj1 = new Complexity(real_part_obj1,imginary_part_obj1);
        Complexity obj2 = new Complexity(real_part_obj2,imginary_part_obj2);

        Complexity resultOfSum = obj1.sum(obj2);
        // System.out.println(result.realPart +"+"+result.imaginaryPart+"i");
        System.out.println(resultOfSum);

        Complexity resultOfSubstract = obj1.substract(obj2);
        System.out.println(resultOfSubstract);

        Complexity resultOfMultiply = obj1.multiply(obj2);
        System.out.println(resultOfMultiply);

      



        
    }
    
}
class Complexity{
    int realPart;
    int imaginaryPart;
    Complexity(int realPart ,int imaginaryPart ){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    Complexity sum(Complexity other ){  //->other is just name defining other object 
        int real = this.realPart + other.realPart;
        int imaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complexity(real,imaginary);
    }

    Complexity substract(Complexity other){
        int real = this.realPart - other.realPart;
        int imaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complexity(real,imaginary);

    }

    Complexity multiply(Complexity other){
        int real = this.realPart*other.realPart +  this.imaginaryPart * other.imaginaryPart*(-1);
        int imaginary = this.realPart*other.imaginaryPart + this.imaginaryPart*other.realPart;
        return new Complexity(real,imaginary);
    }

    @Override  // the method toString() inside the System.out.println which automatically called
    public String toString(){
        return realPart + " + " + imaginaryPart+"i";

    }

}

