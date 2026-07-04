public class Problem03 {
    public static void main(String arg[]){
        int x, y, z;
        x = y = z=2;
        x+=y;
        y-=z;
        z /= (x+y);

        System.out.println("x :" + x +" "+"y :"+ y +" "+"z :"+z);
    }
    
}
