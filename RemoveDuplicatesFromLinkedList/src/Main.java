class Node
{
    public
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
};


 class Solution {
    public static Node uniqueSortedList(Node head) {
        Node current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }

        } return head;
    }
    public static void display(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "<->");
        temp=temp.next;
    }
    }
    public static void main(String[] args){
        Node head=new Node(2);
        head.next=new Node(5);
        head.next.next=new Node(2);
        head.next.next.next=new Node(7);
        Node ans=uniqueSortedList(head);
        display(ans);

    }
}