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
}

//Find middle linked list
 class findMiddleLinkedList {
    public static Node findMiddle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        Node list=findMiddle(head);
        display(list);
    }
}