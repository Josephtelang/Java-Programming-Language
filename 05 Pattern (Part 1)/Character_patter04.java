public class Character_patter04 {
    public static void main(String arg[]){
        int n = 7;
        char ch = 'A';

        for (int line = 1; line<=n; line++){
            for (int chars = 1; chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        
    }
    
}
