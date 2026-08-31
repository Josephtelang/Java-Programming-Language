import java.util.ArrayList;

public class Operations_on_ArrayLists_02 {
    public static void main(String arg[]){
        // ClassName ObjectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(4,9); // O(n)
        System.out.println(list);

        // Get operation --> O(1)
        int element = list.get(3);
        System.out.println(element);

        // Delete operation --> O(n)
        list.remove(2);
        System.out.println(list);

        // Set operation --> O(n)
        list.set(2,10);
        System.out.println(list);

        // Contains operation --> O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
    
}
