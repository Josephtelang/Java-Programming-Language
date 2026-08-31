    public class Queues_using_LL_03{
        public static class Node{
            Node next;
            int data;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static class Queues{
            Node head = null;
            Node tail = null;

            public boolean isEmpty(){
                return head == null;
            }

            // Add
            public void add(int data){
                Node newNode = new Node(data);


                if(head == null){
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
                
            }

            // remove 
            public int remove(){
                if(isEmpty()){
                    System.out.println("Queues is empty");
                    return -1;
                }

                int front = head.data;
                // single node 
                if(head == tail){
                    head = tail = null;
                    return front;
                }

                head = head.next;
                return front;
            }

            // Peak
            public int peek(){
                if(isEmpty()){
                    System.out.println("Queues is empty");
                    return -1;
                }

                return head.data;
            }
        }
        public static void main(String arg[]){
            Queues q = new Queues();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }

    }