import java.util.* ;
import java.io.*;

 class Node<T> {
 T data;
 Node<T> next;
 Node<T> prev;

 public Node(T data) {
 this.data = data;
 }
 }


 class Solution {

    public static boolean findPair(Node<Integer> head, int k) {
        // Write your code here.
        Set<Integer> seenValues=new HashSet<>();
        Node<Integer> current=head;
        while(current!=null){
            int complement=k-current.data;
            if(seenValues.contains(complement)){
                return true;
            }
            seenValues.add(current.data);
            current=current.next;
        } return false;

    }
    public static void main(String[] args){
    Node<Integer> head=new Node<>(3);
    head.next=new Node<>(7);
    head.next.next=new Node<>(2);
    head.next.next.next=new Node(9);
    boolean ans=findPair(head,10);
        System.out.println(ans);
    }
}