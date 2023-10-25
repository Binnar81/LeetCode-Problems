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


 class Solution
{
    public static int lengthOfLoop(Node head) {
        Node slow=head;
        Node fast=head;
        Node ans=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(ans!=slow){
                    ans=ans.next;
                    slow=slow.next;
                }
                Node temp=ans;
                int count=0;
                int flag=0;
                while(temp!=ans || flag==0){
                    count++;
                    temp=temp.next;
                    flag=1;
                } return count;
            }
        } return 0;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;
        int ans=lengthOfLoop(head);
        System.out.println(ans);

    }
}