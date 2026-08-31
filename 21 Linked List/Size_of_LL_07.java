public class Size_of_LL_07 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First Method
    public void addFirst(int data){
        // Step 1 -> Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -> newNode next = head
        newNode.next = head; // link

        // Step 3 -> head = newNode
        head = newNode;


    }
    
    // Add Last
    public void addLast(int data){
        // Step 1 -> Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -> tail next = newNode
        tail.next = newNode; // link

        // Step 3 -> tail = newNode
        tail = newNode;
    }

    // Print a LinkedList
    public void print(){  // O(n)
        Node temp = head;
        if(temp == null){
            System.out.print("Linked list is empty");
        }
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // Add in middle of LL
    public void add(int idx,int data){
        if(idx == 0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        
        while(i < idx-1){
            temp = temp.next;
            i++;

        }

        // i = idx-1 -> tem = prev
        newNode.next = temp.next;
        temp.next = newNode;
        

    }

    public static void main(String arg[]){
        Size_of_LL_07 ll = new Size_of_LL_07();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        System.out.println(ll.size);


    }
    
}
