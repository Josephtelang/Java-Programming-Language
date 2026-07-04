public class my_practice_05 {
    public static int tiling_problem(int n){
        // base case
        if ( n==0 || n==1){
            return 1;
        }

        // choices
        // vertical
        int fnm1 = tiling_problem(n-1);

        // horizontal
        int fnm2 = tiling_problem(n-2);

        int total_ways= fnm1 + fnm2;
        return total_ways;

    }
    public static void removeDublicates(String str , int idx , StringBuilder newstr , boolean map[]){
        if (idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar-'a']==true){
            removeDublicates(str,idx+1,newstr,map);


        }
        else{
            map[currchar-'a'] = true;
            removeDublicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String arg[]){
        // System.out.println(tiling_problem(4));

        // removeDublicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friends_pairing(3));

        binaryString_without_cons_1s(3, 0, "");  // we have to alway pass 0
    }
    public static int friends_pairing(int n){
        if (n==1||n==2){
            return n;
        }

        int fnm1 = friends_pairing(n-1);
        int fnm2 = friends_pairing(n-2);

        int total_ways = fnm1 + (n-1) *fnm2;
        return total_ways;
    }

    public static void binaryString_without_cons_1s(int n,int last_place,String str){
        if ( n==0){
            System.out.println(str);
            return;

        }

        binaryString_without_cons_1s(n-1, 0, str+"0");
        if(last_place==0){
            binaryString_without_cons_1s(n-1, 1, str+"1");
        }
    }
}
