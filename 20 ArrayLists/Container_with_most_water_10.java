import java.util.ArrayList;


public class Container_with_most_water_10 {
    public static int mostWater(ArrayList<Integer> hight){
        // broute force -> O(n)
        int maxWater = Integer.MIN_VALUE;
        for(int i=0 ; i<hight.size(); i++){
            for(int j=i+1 ; j<hight.size() ; j++){
                int ht = Math.min(hight.get(i),hight.get(j));
                int wigth = j-i;
                int currWater = ht*wigth;
                maxWater = Math.max(currWater,maxWater);
                
            }
        }
        return maxWater;
    }

    public static int mostWater2(ArrayList<Integer> hight){
        // two pointer method
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = hight.size()-1;

        while(lp<=rp){
            int wight = rp-lp ;
            int ht = Math.min(hight.get(lp),hight.get(rp));
            int currWater = wight*ht;
            maxWater = Math.max(currWater,maxWater);

            if(hight.get(lp) < hight.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }

        return maxWater;
    }
    public static void main(String arg[]){
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(mostWater(hight));
        System.out.println(mostWater2(hight));


    }
    
}
