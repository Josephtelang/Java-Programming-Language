public class Linear_Search_on_Str05 {
    public static int linear_search_on_str(String menu[], String key){
        for (int i = 0 ; i < menu.length ; i++){
            if (menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        String menu[] = {"samosa","chole bhature","coffee","bread pakoda","mongo juice"};
        
        String key = "java";
        int index = linear_search_on_str(menu, key);
        if (index == -1){
            System.out.println("The key does not exist in array");

        }
        else{
            System.out.println("The index of the key is : "+index);
        }



    }
    
}
