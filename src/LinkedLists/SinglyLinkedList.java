package LinkedLists;

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

        public ListNode DeleteNodeAtPosition(int position){
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
               return curr;
           }
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

            sll.InsertNodeatBeginning(3);
            sll.InsertNodeatBeginning(1);
            sll.InsertNodeatBeginning(8);
            sll.InsertNodeatBeginning(15);

            sll.InsertNodeatEnd(7);
            sll.InsertNodeatEnd(4);

            sll.InsertNodeAtPosition(12,1);
            sll.InsertNodeAtPosition(17,3);
            sll.InsertNodeAtPosition(6,4);

            System.out.printf("\nNode removed at first :%s",sll.DeleteNodeAtFirst().data);
            System.out.printf("\nNode removed at last :%s",sll.DeleteNodeAtLast().data);



            sll.PrintSinglyLinkedList();

            System.out.printf("Length of Singly Linked List is : %d",sll.LengthOfSinglyLinkedList());

        }
    }

