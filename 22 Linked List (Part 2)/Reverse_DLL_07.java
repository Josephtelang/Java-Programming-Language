public class Reverse_DLL_07 {
        public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; 

    // add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // Print
    public void Print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;

        }
        System.out.println("null");
    }


    // remove First
    public int removeFirst(){
        if(head==null){
            System.out.println("The Doubly LL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
        
    }

    // reverse doubly LL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String arg[]){
        Reverse_DLL_07 dll = new Reverse_DLL_07();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.Print();
        dll.reverse();
        dll.Print();




    }
    
}
