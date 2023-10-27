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



 class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.
        if(head==null || head.next==null){
            return head;
        }
        Node even_Head=null;
        Node even_Tail=null;
        Node odd_Head=null;
        Node odd_Tail=null;
        Node traverse=head;
        while(traverse!=null){
            if(traverse.data%2==0){
                if(even_Head==null){
                    even_Head=traverse;
                    even_Tail=traverse;
                }
                else{
                    even_Tail.next=traverse;
                    even_Tail=traverse;
                }
            }
            else{
                if(odd_Head==null){
                    odd_Head=traverse;
                    odd_Tail=traverse;
                }
                else{
                    odd_Tail.next=traverse;
                    odd_Tail=traverse;
                }
            }
            traverse=traverse.next;
        }
        even_Tail.next=odd_Head;
        odd_Tail.next=null;
        return even_Head;

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head=new Node(6);
        head.next=new Node(5);
        head.next.next=new Node(4);
        head.next.next.next=new Node(3);
        Node ans=segregateEvenOdd(head);
        display(ans);

    }
}
