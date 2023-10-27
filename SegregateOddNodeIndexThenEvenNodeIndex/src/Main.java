
   class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }

      Node(int val, Node next) { this.val = val; this.next = next; }
  }

class Solution {
    public Node oddEvenList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node evenHead=null;
        Node evenTail=null;
        Node oddHead=null;
        Node oddTail=null;
        Node traverse=head;
        int count=1;
        while(traverse!=null){

            if(count%2==0){
                if(evenHead==null){
                    evenHead=traverse;
                    evenTail=traverse;
                }
                else{
                    evenTail.next=traverse;
                    evenTail=traverse;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=traverse;
                    oddTail=traverse;
                }
                else{
                    oddTail.next=traverse;
                    oddTail=traverse;
                }

            }
            traverse=traverse.next;
            count++;

        }
        oddTail.next=evenHead;
        evenTail.next=null;
        return oddHead;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
    }
    public  void main(String[] args){
        Node head=new Node(7);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(9);
        Node ans=oddEvenList(head);
        display(ans);

    }
}

