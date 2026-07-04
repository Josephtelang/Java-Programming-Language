public class Problem04 {

    public static void main(String[] args) {
        
        byte bt = 4;
        char c = 5;
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9;

        double ans = (f + bt) * (i % c) - (d * s);

        System.out.println(ans);

    }
    
}
