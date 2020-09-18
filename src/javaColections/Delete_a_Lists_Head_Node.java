package javaColections;

import java.util.LinkedList;

public class Delete_a_Lists_Head_Node {
    /* Given a singly-linked list, write a method to delete the first node of the list and return the new head.
       Example:
       LinkedList: 1->2->3 , Head = 1
       deleteAtHead(Head) ==> 2->3
     */


       public static void main(String[] args) {

       }


       public static LinkedList deleteAtHead(LinkedList head){
          if (head==null) return null;
      // store head.next in temp variable so that we can reference it later
//           LinkedList temp=head.next();
      //   detach head from the list
//          head.next=null;
//      //  set next ListNode stored in temp variable as a new head.
//          head=temp;
          return head;
       }
}
