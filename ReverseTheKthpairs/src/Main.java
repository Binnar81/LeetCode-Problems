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
    public static Node kReverse(Node head, int k) {
        if(head==null || k==1){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node curr=dummy;
        Node next=dummy;
        Node prev=dummy;
        int count=0;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        while(count>=k){
            curr=prev.next;
            next=curr.next;
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            count-=k;
        }
        return dummy.next;
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
        Node ans=kReverse(head,2);
        display(ans);
    }
}