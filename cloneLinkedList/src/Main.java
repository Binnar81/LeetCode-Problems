class Node {
    public int data;
    public Node next;
    public Node random;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.random = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.random = null;
    }
    Node(int data, Node next, Node random)
    {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}


 class Solution {
    public static Node cloneLL(Node head) {
        // Write your code here.
        Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.data);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }

        Node iter=head;
        while(iter!=null){
            if(iter.random!=null){
                iter.next.random=iter.random.next;
            }
            iter=iter.next.next;

        }

        Node dummy=new Node(0);
        Node copy=dummy;
        iter=head;
        Node fast;
        while(iter!=null){
            fast=iter.next.next;
            copy.next=iter.next;
            iter.next=fast;
            copy=copy.next;
            iter=fast;
        }
        return dummy.next;
    }
    static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data+":");
            if(head.next != null)
                System.out.print(head.next.data);
            else
                System.out.print("NULL");
            if(head.random != null)
                System.out.print(","+head.random.data);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }

    public static void main(String args[]) {
        Node head = null;

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;

        head.random = node4;
        head.next.random = node1;
        head.next.next.random = null;
        head.next.next.next.random = node2;

        printList(head);

        Node newHead = cloneLL(head);
        printList(newHead);
    }
}
