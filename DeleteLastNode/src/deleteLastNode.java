

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


//Delete Last Node of the given Node
 class Solution {
    static Node deleteLast(Node head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node current =head;
        while(current.next.next!=null){
            current =current.next;

        }
        current.next=null;
        return head;
        }
        public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.println("null");
        }
        public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
            System.out.println("Original list:");
        display(head);
        head=deleteLast(head);
            System.out.println("list after deleting last node:");
            display(head);
        }
    }