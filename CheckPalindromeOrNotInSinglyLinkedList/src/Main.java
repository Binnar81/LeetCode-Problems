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


 class Solution {
    public static Node reverse(Node rev){
        Node prev=null;
        Node next=null;
        while(rev!=null){
            next=rev.next;
            rev.next=prev;
            prev=rev;
            rev=next;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head) {

        Node slow=head;
        Node fast=head;
        Node dummy=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(slow.data!=dummy.data){
                return false;
            }
            dummy=dummy.next;
            slow=slow.next;
        } return true;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(4);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        boolean ans=isPalindrome(head);
        System.out.println(ans);

    }
}