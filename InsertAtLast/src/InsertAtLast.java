class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
};
public class InsertAtLast {
    public static Node inserAtLast(Node list,int k){
        Node head=list;
        Node x=new Node(k);
        if(head==null){
            return x;
        }
        while(head.next!=null){
            head=head.next;
        }
        head.next=x;
        x.prev=head;
        return list;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args){
        Node list=new Node(1);
        list.next=new Node(2);
        list.next.next=new Node(5);
        int k=20;
        System.out.println("Original list");
        display(list);
        list=inserAtLast(list,k);
        System.out.println("list after inserting k value at the last node:");
        display(list);
    }
}