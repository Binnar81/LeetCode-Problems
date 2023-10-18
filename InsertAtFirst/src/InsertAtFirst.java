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

class InserAtFirst{
    public static Node insertAtFirst(Node list, int newValue) {
        Node newNode=new Node(newValue);
        newNode.next=list;
        return newNode;
    }
    public static void printInsertFirst(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node list=new Node(2);
        list.next=new Node(4);
        list.next.next=new Node(5);
        int newValue=1;
        list=insertAtFirst(list,newValue);
        printInsertFirst(list);
    }

        }