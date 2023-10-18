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
class PrintLinkedList {
    public static Node constructLL(int []arr) {
        Node[] BigNode=new Node[arr.length];
        for(int i=0;i<arr.length;i++){
             BigNode[i]=new Node(arr[i],null);
        }
        for(int i=0;i<arr.length-1;i++){
            BigNode[i].next=BigNode[i+1];
        } return BigNode[0];
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7};
        Node[] bignode=new Node[arr.length];
        for(int i=0;i<arr.length;i++){
            bignode[i]=new Node(arr[i],null);
        }
        for(int i=0;i<arr.length-1;i++){
            bignode[i].next=bignode[i+1];
        }
        Node firstnode=bignode[0];
        while(firstnode!=null){
            System.out.print(firstnode.data+ "->");
            firstnode=firstnode.next;
        }
        System.out.println("End");
    }

}