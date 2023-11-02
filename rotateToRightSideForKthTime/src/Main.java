class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
};


 class Solution {
    public static Node rotate(Node head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        Node temp=head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%length;
        int end=length-k;
        while(end-->0) temp=temp.next;
        head=temp.next;
        temp.next=null;
        return head;
    }
    public static void display(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        display(head);
        System.out.println();
        Node ans=rotate(head,2);
        display(ans);
    }
}