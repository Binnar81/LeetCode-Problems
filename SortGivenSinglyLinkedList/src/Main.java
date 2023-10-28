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
    public static Node sortList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=null;
        Node l1=sortList(head);
        Node l2=sortList(slow);
        return merge(l1,l2);
    }
    public static Node merge(Node l1,Node l2){
    Node l=new Node(0),p=l;
    while(l1!=null && l2!=null){
        if(l1.data<l2.data){
            p.next=l1;
            l1=l1.next;
        }
        else{
            p.next=l2;
            l2=l2.next;
        }
        p=p.next;
    }
    if(l1!=null){
        p.next=l1;
    }
    if(l2!=null){
        p.next=l2;
    }
    return l.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head=new Node(14);
         head.next=new Node(5);
        head.next.next=new Node(17);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(8);
        head.next.next.next.next.next=new Node(10);
        display(head);
        System.out.println();
        Node ans=sortList(head);
        display(ans);
    }
}