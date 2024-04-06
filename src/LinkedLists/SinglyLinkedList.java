package LinkedLists;

import java.io.PrintStream;

public class SinglyLinkedList {

       private ListNode head;
       private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
       }

        public void PrintSinglyLinkedList(){
            ListNode current=head;
            System.out.println(" ");
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.println("null");
        }

        public int LengthOfSinglyLinkedList(){
           int count=0;
           ListNode current=head;
           while(current!=null){
               count++;
               current=current.next;
           }
           return count;
        }

        public void InsertNodeatBeginning(int val){
           ListNode newNode=new ListNode(val);
           newNode.next=head;
           head=newNode;
        }

        public void InsertNodeatEnd(int val){
           ListNode newNode=new ListNode(val);
           if(head==null){
               head=newNode;
               return;
           }
           ListNode current=head;
           while(current.next!=null){
               current=current.next;
           }
           current.next=newNode;
        }

        public void InsertNodeAtPosition(int value,int position){
           ListNode newNode=new ListNode(value);
           if(position==1){
               newNode.next=head;
               head=newNode;
           }

           else{
               ListNode prev=head;
               int count=1;
               while(count<position-1 && prev!=null){
                   prev=prev.next;
                   count++;
               }

               assert prev != null;
               newNode.next= prev.next;
               prev.next=newNode;

           }
        }

        public ListNode DeleteNodeAtFirst(){
           if(head==null){
               return null;
           }

           ListNode temp=head;
           head=head.next;
           temp.next=null;
           return temp;


        }
        public ListNode DeleteNodeAtLast(){
           if(head==null||head.next==null){
               return head;
           }
           ListNode curr=head;
           ListNode prev=null;

           while(curr.next!=null){
               prev=curr;
               curr=curr.next;
           }
           prev.next=null;
           return curr;
        }

        public void DeleteNodeAtPosition(int position){
           if(position==1){
               head=head.next;
           }
           else{
               ListNode prev=head;
               int count=1;
               while(count<position-1){
                   prev=prev.next;
                   count++;
               }
               ListNode curr=prev.next;
               prev.next=curr.next;
           }
        }
        public void DeleteKey(int key){
           ListNode curr=head;
           ListNode prev=null;
           if(curr!=null && curr.data==key){
               head=curr.next;
               return;
           }
           while(curr!=null&& curr.data!=key){
               prev=curr;
               curr=curr.next;
           }
           if(curr==null){
               return;
           }
           prev.next=curr.next;

        }


        public void InsertInSortedList(int val){
           ListNode newNode=new ListNode(val);
           ListNode curr=head;
           ListNode prev=null;

           while(curr!=null && curr.data< newNode.data){
               prev=curr;
               curr=curr.next;
           }
           newNode.next=curr;
           prev.next=newNode;

        }

        public void RemoveDuplicates(){
           ListNode curr=head;
           while(curr!=null && curr.next!=null){
               if(curr.data==curr.next.data){
                   curr.next=curr.next.next;
               }
               else{
                   curr=curr.next;
               }
           }
        }

        public boolean Search(int element){
           ListNode current=head;
           while(current!=null){
               if(current.data==element){
                   return true;
               }
               current=current.next;
           }
           return false;
        }

        public void ReverseList(){
           ListNode curr=head;
           ListNode prev=null;
           ListNode next;
           while(curr!=null){
               next=curr.next;
               curr.next=prev;
               prev=curr;
               curr=next;
           }
           head=prev;
        }

        public ListNode MiddleNode(){
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;

           }
           return slow;
        }

        public ListNode NthNodeFromEnd(int n){
           ListNode first=head;
           ListNode second=head;

           for(int i=0;i<n;i++){
               if(first==null){
                   return null; //List is shorter than n
               }
               first=first.next;
           }
           while(first!=null){
               first=first.next;
               second=second.next;
           }
           return second;
        }



        public static void main(String[] args) {
            SinglyLinkedList sll=new SinglyLinkedList();
//            sll.head=new ListNode(10);
//            ListNode second=new ListNode(1);
//            ListNode third=new ListNode(8);
//            ListNode fourth=new ListNode(11);
//
//            sll.head.next=second;
//            second.next=third;
//            third.next=fourth;

//            sll.InsertNodeatBeginning(3);
//            sll.InsertNodeatBeginning(1);
//            sll.InsertNodeatBeginning(8);
//            sll.InsertNodeatBeginning(15);
//
//            sll.InsertNodeatEnd(7);
//            sll.InsertNodeatEnd(4);
//
//            sll.InsertNodeAtPosition(12,1);
//            sll.InsertNodeAtPosition(17,3);
//            sll.InsertNodeAtPosition(6,4);
//
//            System.out.printf("\nNode removed at first :%s",sll.DeleteNodeAtFirst().data);
//            System.out.printf("\nNode removed at last :%s",sll.DeleteNodeAtLast().data);
//            System.out.printf("\nNode removed at position %s",3);
//            System.out.printf("\nKey removed %s",17);
//            sll.DeleteNodeAtPosition(3);
//            sll.DeleteKey(17);
            sll.InsertNodeatEnd(1);
            sll.InsertNodeatEnd(8);
            sll.InsertNodeatEnd(10);
            sll.InsertNodeatEnd(16);
            sll.InsertNodeatEnd(26);
            sll.InsertNodeatEnd(26);
            sll.InsertNodeatEnd(37);





            sll.PrintSinglyLinkedList();

            sll.InsertInSortedList(12);

            sll.RemoveDuplicates();

            int element=10;
            boolean isPresent=sll.Search(element);
            System.out.printf("Is present %b:",isPresent);
            sll.ReverseList();
            sll.PrintSinglyLinkedList();

            System.out.printf("\n Middle Node is %s",sll.MiddleNode().data);

            System.out.printf("\n 3rd Node is %s",sll.NthNodeFromEnd(3).data);

            System.out.printf("\n Length of Singly Linked List is : %d",sll.LengthOfSinglyLinkedList());

        }
    }

