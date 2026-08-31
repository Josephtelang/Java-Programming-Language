package Practice_problems_08;

public class Delete_N_nodes_after_M_nodes_02 {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.next = null;
            this.data = data;
            
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

    // Remove first
    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty ");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // prev : i = size - 2 
        Node prev = head;
        for(int i=0 ; i < size - 2 ; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    // Iterative search
    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){  // key found case
                return i;
            }
            temp = temp.next;
            i++;


        }

        // key not found case
        return -1;
        

    }

    public int helper(int key, Node head){
        if(head == null){
            return -1;

        }
        
        if(head.data == key){
            return 0;
        }

        int idx = helper(key,head.next);

        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    // Recursive search
    public int recSearch(int key){
        return helper( key, head);
    }

    // Reverse a LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void delete_N_nodes_after_M_nodes(Node head,int M , int N){
        Node curr = head;
        
        while(curr != null){
            int kept = 0;
            int deleted = 0;
            // keep nodes
            while(kept < M-1 && curr != null ){
                kept++;
                curr = curr.next;
                

            }

            // delete nodes
            while(deleted < N && curr != null && curr.next !=null){
                deleted++;
                curr.next = curr.next.next; 

            }
            if (curr != null){

                curr = curr.next; // this takes curr to node after deleted node
            }
            
        }

    }
    

    public static void main(String arg[]){
        Delete_N_nodes_after_M_nodes_02 ll = new Delete_N_nodes_after_M_nodes_02();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        delete_N_nodes_after_M_nodes(head,2,2);
        ll.print();


    }
    
}
