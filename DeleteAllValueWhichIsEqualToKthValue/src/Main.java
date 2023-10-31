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
}


 class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node curr=head;
        Node dummy=new Node();
        Node temp=dummy;
        while(curr!=null){
            if(curr.data!=k){
                dummy.next=curr;
                dummy=dummy.next;
            } curr=curr.next;
        }
        dummy.next=null;
        return temp.next;
    }
    public static void display(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "<->");
        temp=temp.next;
    }
    }
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(4);
        head.next.next=new Node(6);
        head.next.next.next=new Node(10);
        display(head);
        System.out.println();
        Node ans=deleteAllOccurrences(head,10);
        display(ans);

    }
 }