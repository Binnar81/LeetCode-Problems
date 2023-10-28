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


 class Solution
{
    public static Node removeKthNode(Node head, int K){
        if(head==null || K<=0){
            return head;
        }
        Node fast=head;
        while(K>0){
            fast=fast.next;
            K--;
            //if Kth value is greater than the Linked List length
            if(fast==null){
                return head.next;
            }
        }
        Node slow=head;
        Node prev=null;
        while(fast!=null){
            fast=fast.next;
            prev=slow;
            slow=slow.next;
        }
        //if Kth value is greater than given Linked list length then remove first Node
        if(prev==null){
            return head.next;
        }
        else{
            prev.next=slow.next;

        } return head;

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
    head.next=new Node(4);
        head.next.next=new Node(7);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(10);
        display(head);
        System.out.println();
        Node ans=removeKthNode(head,2);
        display(ans);

    }
}