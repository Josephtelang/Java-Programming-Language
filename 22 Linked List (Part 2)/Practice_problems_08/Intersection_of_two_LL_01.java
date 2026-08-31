package Practice_problems_08;
import java.util.ArrayList;

// leetcode problem : # 160
// defficulty level : easy
public class Intersection_of_two_LL_01 {

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

    public static void intersection_of_two_node_unOptimized(Node n1, Node m1){
        ArrayList<Node> Nodes = new ArrayList<>();

        // Store every node of list 1
        Node curr = n1;
        while(curr != null){
            Nodes.add(curr);
            curr = curr.next;
        }

        // Traverse list 2
        curr = m1;  
        while(curr != null){  // this loop iterates through integers only so it not reach to null 
            for(Node x : Nodes){
                if(curr == x){
                    System.out.println("Two LinkedList intersect at Node : "+x.data);
                    return;
                }
            }
            curr = curr.next;

        }
        System.out.println("There is no intersection");
        return;

    }

    public static void intersection_of_two_node_Optimized(Node n1, Node m1){
        Node p1 = n1;
        Node p2 = m1;

        while(p1 != p2){
            if(p1 == null){
                p1 = m1;
            }
            else{
                p1 = p1.next;
            }
            
            if(p2 == null){
                p2 = n1;
            }
            else{
                p2 = p2.next;
            }
        }
        if(p1 == null && p2 == null){
            System.out.println("There is no intersection");
            return;
        }
        
        System.out.println("Two LinkedList intersect at Node : "+p1.data);
        return;
    }
    public static void main(String arg[]){
        Node commNode6 = new Node(6);
        Node commNode7 = new Node(7);
        commNode6.next = commNode7;
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = commNode6;

        Node m1 = new Node(4);
        Node m2 = new Node(5);
        m1.next = m2;
        m2.next = commNode6;

        intersection_of_two_node_unOptimized(n1, m1);
        intersection_of_two_node_Optimized(n1, m1);
        



        
        


    }
    
}
