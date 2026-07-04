public class Remove_Dublicates_in_string_02 {
    public static void removeDublicates(String str , int idx , StringBuilder newstr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar-'a'] == true){
            removeDublicates(str,idx+1,newstr,map);

        }
        else{
            map[currchar-'a'] = true;
            removeDublicates(str,idx+1,newstr.append(currchar),map);
        }

    }

    public static void main(String arg[]){
        String str = "appnnacollege";
        removeDublicates(str,0,new StringBuilder(""),new boolean[26]);

    }
    
}
