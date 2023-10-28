import java.util.*;


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
    public static Node sortList(Node head) {
        // Write your code here
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];
        int count=0;
        temp=head;
        while(temp!=null){
            arr[count++]=temp.data;
            temp=temp.next;
        }
        Arrays.sort(arr);
        count=0;
        temp=head;
        while(temp!=null){
            temp.data=arr[count++];
            temp=temp.next;
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(2);
        display(head);
        System.out.println();
        Node ans=sortList(head);
        display(ans);
    }
}