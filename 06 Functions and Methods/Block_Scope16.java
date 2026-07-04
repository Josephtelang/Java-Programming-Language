public class Block_Scope16 {
    public static void main(String[] args) {
        int p = 4;
        {
            int s = 45;
            System.out.println(s);
            System.out.println(p);
        }
        // System.out.println(s);
        System.out.println(p);
    }
    
}
