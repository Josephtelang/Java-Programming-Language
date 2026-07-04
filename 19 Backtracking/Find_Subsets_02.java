public class Find_Subsets_02 {
    public static void find_subsets(String str , String ans , int i){
        //Base case
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }


        //recursion
        //yes
        find_subsets(str , ans+str.charAt(i), i+1);
        
        //no
        find_subsets(str, ans, i+1);
    }

    public static void main(String arg[]){
        String str = "abc";
        find_subsets(str,"",0);
    }
    
}
