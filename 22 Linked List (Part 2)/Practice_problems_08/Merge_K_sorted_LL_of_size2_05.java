package Practice_problems_08;
import java.util.ArrayList;

// leet code : # 23
// defficulty level : hard
public class Merge_K_sorted_LL_of_size2_05 {
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

    public static Node mergeKSortedLLOfSize2(Node lists[] , int k ){
        ArrayList<Node> llHeads = new ArrayList<>();
        for(int i=0; i< lists.length ; i++){
            llHeads.add(lists[i]);
        }
        Node mergeHead = new Node(-1);
        Node mergeTail = mergeHead;

        
        while(true){
            Node smallNode = null;
            int smallNodeIndex = -1;
            for(int i=0 ; i<k ; i++){
                if(llHeads.get(i) != null  && (smallNode == null || llHeads.get(i).data < smallNode.data)){
                    smallNodeIndex = i;
                    smallNode = llHeads.get(i);

                
                }
            }
            if(smallNode == null){
                break;
            }
            else{

                mergeTail.next = smallNode;
                llHeads.set(smallNodeIndex,smallNode.next);
                mergeTail = mergeTail.next;
            }



            
        }

        return mergeHead.next;

    }

    public static Node mergeKSortedLLOfSize2(Node list[],int start, int end){
        if(start == end){
            return list[start];
        }


        int mid = start + (end - start)/2;

        Node leftNode = mergeKSortedLLOfSize2(list, start, mid);
        Node rightNode = mergeKSortedLLOfSize2(list, mid+1,end);

        return mergeTowLinkedList(leftNode,rightNode);



    }

    public static Node mergeTowLinkedList(Node leftNode, Node rightNode){
        Node mergeHead = new Node(-1);
        Node mergeTail = mergeHead;

        while(leftNode != null && rightNode!= null){
            if(leftNode.data <= rightNode.data){
                mergeTail.next = leftNode;
                leftNode = leftNode.next;              
            }
            else{
                mergeTail.next = rightNode;
                rightNode = rightNode.next;
            }
            mergeTail = mergeTail.next;
        }

        // remain left
        while(leftNode != null){
            mergeTail.next = leftNode;
            leftNode = leftNode.next;
            mergeTail = mergeTail.next;
        }

        // remain right
        while(rightNode != null){
            mergeTail.next = rightNode;
            rightNode = rightNode.next;
            mergeTail = mergeTail.next;
        }

        return mergeHead.next;
    }
    public static void main(String arg[]){
        Merge_K_sorted_LL_of_size2_05 ll = new Merge_K_sorted_LL_of_size2_05();
        Node l1 = new Node(1);
        l1.next = new Node(3);
        
        Node l2 = new Node(2);
        l2.next = new Node(4);
        
        Node l3 = new Node(5);
        l3.next = new Node(6);

        int k = 3;
        
        Node lists[] = new Node[k];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        // head = mergeKSortedLLOfSize2(lists, k);
        head = mergeKSortedLLOfSize2(lists, 0,lists.length-1);
        ll.print();

    }

    
}
