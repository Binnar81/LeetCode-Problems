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
    public static Node deleteMiddle(Node head) {
        Node temp = head;
        int size = 1;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int mid = size / 2;
        if (head == null || mid <= 0) {
            return head;
        }
        Node fast = head;
        while (mid > 0) {
            fast = fast.next;
            mid--;
            if (fast == null) {
                return head.next;
            }
        }
        Node slow = head;
        Node prev = null;
        while (fast != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            return head.next;
        } else {
            prev.next = slow.next;
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
    }
    public  void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(9);
        head.next.next=new Node(2);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(3);
        head.next.next.next.next.next=new Node(10);
        display(head);
        System.out.println();
        Node ans=deleteMiddle(head);
        display(ans);
    }
}