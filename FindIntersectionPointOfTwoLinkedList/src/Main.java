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
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node a=firstHead;
        Node b=secondHead;
        while(a!=b){
            a=a==null?secondHead:a.next;
            b=b==null?firstHead:b.next;

        }
        return a.data;
    }

    public  void main(String[] args){
    Node firstHead=new Node(2);
    firstHead.next=new Node(7);
        firstHead.next.next=new Node(8);
        firstHead.next.next.next=new Node(5);
        Node secondHead=new Node(4);
         secondHead.next=new Node(9);
        secondHead.next.next=new Node(8);
        secondHead.next.next.next=new Node(5);
        int ans=findIntersection(firstHead,secondHead);
        System.out.println(ans);

    }
}