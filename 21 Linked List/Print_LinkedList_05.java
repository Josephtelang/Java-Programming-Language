public class Print_LinkedList_05 {
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

    // Add First Method
    public void addFirst(int data){
        // Step 1 -> Create new node
        Node newNode = new Node(data);
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

    public static void main(String arg[]){
        Print_LinkedList_05 ll = new Print_LinkedList_05();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();


    }
    
}
