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

//If LinkedList is Cycled then find out the Index position where linked list cycle started
 class Solution {
     public static Node firstNode(Node head) {
         if (head == null || head.next == null) {
             return null;
         }
         Node slow = head;
         Node fast = head;
         Node ans = head;
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             if (slow == fast) {
                 while (ans != slow) {
                     ans = ans.next;
                     slow = slow.next;
                 }
                 return ans;
             }
         }
         return null;
     }

     public static void main(String[] args) {
         Node head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = head.next;
         Node index = Solution.firstNode(head);
         if (index != null) {
             System.out.println(index);
         } else {
             System.out.println("null");
         }
     }
 }