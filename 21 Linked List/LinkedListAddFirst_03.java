

public class LinkedListAddFirst_03 {
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

    public static void main(String arg[]){
        LinkedListAddFirst_03 ll = new LinkedListAddFirst_03();
        ll.addFirst(1);
        ll.addFirst(2);


    }
    
}
