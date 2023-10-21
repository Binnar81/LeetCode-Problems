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

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};

//Reverse the given Doubly Linked List
class Solution
{
    public static Node reverseDLL(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head;
        Node prev=null;
        while(curr.next!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        curr.next=prev;
        head=curr;
        return head;
    }
    public static void display(Node head){
    Node temp=head;
    Node last=null;
    while(temp.next!=null){
        System.out.print(temp.data+ "->");
        last=temp;
        temp=temp.next;
    }
    while(last!=null){
        System.out.print(last.data+ "<-");
        last=last.prev;
    }

    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        display(head);
        System.out.println("end");
        Node list=reverseDLL(head);
        display(list);
        System.out.println("start");
    }
}