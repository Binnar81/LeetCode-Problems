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

    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
};
public class ReturnDoublyLinkedList {
    public static Node constructDLL(int []arr) {
        Node head=new Node(arr[0]);
        Node temp=head;
        int i=1;
        while(i<arr.length){
            Node arrNode=new Node(arr[i]);
            temp.next=arrNode;
            arrNode.prev=temp;
            temp=arrNode;
            i++;
        } return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node list=constructDLL(arr);
        display(list);
    }
}