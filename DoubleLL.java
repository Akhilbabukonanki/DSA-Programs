public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void print(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"<-->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addlast(3);
        dll.addlast(2);
        dll.print();
        dll.removeFirst();
        dll.removeLast();
        dll.print();

    }
}