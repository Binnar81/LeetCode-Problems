


 class Node {
 public int data;
 public Node next;

 Node(int data) {
 this.data = data;
 this.next = null;
 }
 }


 class Solution {
     public Node addNode(Node head) {
         Node temp = head;
         int result = 0;
         while (temp != null) {
             result = result * 10 + temp.data;
             temp = temp.next;
         }
         result = result + 1;
         String str = Integer.toString(result);
         Node addNode = null;
         Node tail = null;
         for (int i = 0; i < str.length(); i++) {
             int digit = Character.getNumericValue(str.charAt(i));
             addNode = new Node(digit);
         }
         if (addNode == null) {
             tail = addNode;
         } else {
             tail.next = addNode;
             tail = addNode;
         } return addNode;
     }
     public static void display(Node head){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+ "->");
             temp=temp.next;
         }
 }
 public  void main(String[] args){
         Node head=new Node(1);
         head.next=new Node(2);
         head.next.next=new Node(0);
         display(head);
     System.out.println();
         Node ans=addNode(head);
         display(ans);

 }

    }