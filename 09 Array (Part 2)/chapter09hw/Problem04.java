public class Problem04 {
    public static void total_water(int height[]){
        int n = height.length;
        int max_left_boundary[] = new int[n];
        int max_right_boundary[] = new int[n];

        max_left_boundary[0] = height[0];
        for (int i = 1; i<n ; i++){
            max_left_boundary[i] = Math.max(height[i],max_left_boundary[i-1]);
        }

        max_right_boundary[n-1] = height[n-1];
        for (int i = n-2; i>=0 ; i--){
            max_right_boundary[i] = Math.max(height[i],max_right_boundary[i+1]);
        }

        int total_water = 0;
        for (int i = 0; i<n ; i++){
            int water_level = Math.min(max_left_boundary[i],max_right_boundary[i]);
            total_water += water_level - height[i];
        }

        System.out.println("The total water stord is : "+total_water);
    }
    public static void main(String arg[]){
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        
        total_water(height);
    }
    
}
