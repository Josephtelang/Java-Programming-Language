public class String_charAt_Method05 {
    public static void Print_Letter(String fullname){
        for (int i = 0 ; i< fullname.length() ; i++){
            System.out.print(fullname.charAt(i)+" ");
        }
    }

    public static void main(String arg[]){
        // String Concatenation

        String firstname = "Joseph";
        String lastname = "Telang";
        String fullname = firstname +" "+lastname;

        System.out.println(fullname);

        System.out.println(fullname.charAt(0));

        Print_Letter(fullname);
    }
    
}
