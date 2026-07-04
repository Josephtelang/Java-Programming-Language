public class Array_as_Function_Arguments03 {
    public static void update(int marks[],int nonchangeble){
        nonchangeble = 10;

        for (int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String arg[]){
        int marks[] = {97,98,99};
        int nonchangeble = 5;

        update(marks, nonchangeble);

        for (int i =0; i<marks.length; i++){
            System.out.println("updated array :"+marks[i]);
        }
        
        System.out.print("unchangeble variable :"+nonchangeble);






    }
    
}
