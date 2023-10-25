import java.util.* ;
import java.io.*;

 class LinkedListNode {
 int data;
 LinkedListNode next;

 public LinkedListNode(int data) {
 this.data = data;
 }
 }




 class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        int sum1=0;
        LinkedListNode temp1=head1;
        while(temp1!=null){
            sum1=(sum1*10)+temp1.data;
            temp1=temp1.next;
        }
        int sum2=0;
        LinkedListNode temp2=head2;
        while(temp2!=null){
            sum2=(sum2*10)+temp2.data;
            temp2=temp2.next;
        }
        LinkedListNode add=new LinkedListNode(sum1+sum2);
        return add;
    }
    public static void main(String[] args){
        LinkedListNode head1=new LinkedListNode(1);
        head1.next=new LinkedListNode(2);
        head1.next.next=new LinkedListNode(3);
        LinkedListNode head2=new LinkedListNode(4);
        head2.next=new LinkedListNode(5);
        head2.next.next=new LinkedListNode(6);
        LinkedListNode list=addTwoNumbers(head1,head2);
        System.out.println(list);
    }
}