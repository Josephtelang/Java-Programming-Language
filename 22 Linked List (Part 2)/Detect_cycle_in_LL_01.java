

public class Detect_cycle_in_LL_01 {
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

    // Delete Nth node from end in LL
    public void deleteNthNodeFromEnd(int n){
        // Calculate size
        int sz = 0 ;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;

        }

        if(n == sz){  // Remove first
            head = head.next;
        }

        // i =1 to i = size - n
        int i=1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
        

    }

    // find middle by Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }
        return slow; // slow is my mid node
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // Step 1 -> find mid
        Node midNode = findMid(head);

        // Step 2 -> Reverse 2nd half of LL
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightNode = prev;
        Node leftNode = head;

        // check if right requal to left 
        while(rightNode != null){
            if(leftNode.data != rightNode.data){
                return false;
            }
            rightNode = rightNode.next;
            leftNode = leftNode.next;
        }

        return true;
    }

    public static boolean isCycle(){ // Floy'w CFA
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
            if(slow == fast){
                return true;  // Cycle exists
            }
        }

        return false;  // Cycle doesn't exist


    }


    public static void main(String arg[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1 -> 2 -> 3 -> 1

        System.out.println(isCycle());
        

    }
    
}
