class Node {
    public int data;
    public Node next;
    public Node child;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.child = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.child = null;
    }
    Node(int data, Node next, Node child)
    {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}


 class Solution {
   public static Node mergeLinkedList(Node l1,Node l2){
   Node temp=new Node(0);
   Node res=temp;
   while(l1!=null && l2!=null){
       if(l1.data<l2.data){
           temp.child=l1;
           temp=temp.child;
           l1=l1.child;
       }
       else{
           temp.child=l2;
           temp=temp.child;
           l2=l2.child;
       }
   }
   if(l1!=null){
       temp.child=l1;
   }
   else{
       temp.child=l2;
   }
   return res.child;
   }

    public static Node flatteningChildLinkedList(Node head){
       if(head==null || head.next==null){
           return head;
       }
       head=flatteningChildLinkedList(head.next);
       head=mergeLinkedList(head,head.next);
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
       head.child=new Node(3);
       head.child.child=new Node(5);
       head.next=new Node(7);
       head.next.child=new Node(9);
       head.next.child.child=new Node(10);
       head.next.next=new Node(12);
       head.next.next.child=new Node(13);
       head.next.next.child.child=new Node(14);
       display(head);
        System.out.println();
        Node ans=flatteningChildLinkedList(head);
        display(ans);

    }

    }