package LinkedList;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}


class LL{
  Node head  = null;
   void insertionAtFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
      head  = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
   }

   void insertionAtLast(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    Node cur = head;
    while(cur.next != null){
      cur = cur.next;
    }

    cur.next = newNode;
   }

   void insertionAtAnyPosition(int data , int pos ){
    Node newNode = new Node(data);
    if(head == null && pos == 1){
      head = newNode;
      return;
    }
    Node prev = null;
    Node cur = head;
    while(cur != null && pos > 1){
      prev = cur;
      cur = cur.next;
      pos--;
    }
    if(pos == 1){
      prev.next = newNode;
      newNode.next = cur;
    }else{
      System.out.println("Insertion Not Possible");
    }

   }

   int deletionAtFirst(){
    if(head == null){
      System.out.println("Deletion Not Possible Because LinkedList is Empty");
      return 0;
    }


    int data = head.data;
    head = head.next;
    return data;

   }

   int deletionAtLast(){
    if(head == null){
      System.out.println("Deletion Not Possible Because LL is Empty");
      return 0;
    }
    if(head.next == null){
      int data = head.data;
      head = null;
      return data;
      
    }
    Node cur = head;
    while(cur.next.next != null){
      cur = cur.next;
    }
    int data = cur.next.data;
    cur.next = null;
    return data;


   }

   int deletionAtAnyWhere(int pos){
    if(head == null){
      System.out.println("Deletion Not Possible");
      return 0;
    }


    Node prev = null;
    Node cur = head;
    while(cur!= null && pos > 1){
      prev = cur;
      cur = cur.next;
      pos--;
    }
    if(pos == 1){
      int data = cur.data;
      prev.next = cur.next;
      return data;
    }
    return 0;

     }



   void printLL(){
    Node cur = head;
    while(cur != null){
      System.out.print(cur.data + "->");
      cur = cur.next;
    }
    System.out.println();
   }

  
}
public class LinkedListImplementation {
  public static void main(String[] args) {
    LL list = new LL();
    
    list.insertionAtLast(2);
    list.insertionAtLast(3);
    list.insertionAtLast(4);
    list.insertionAtLast(6);
    list.insertionAtFirst(1);
    list.insertionAtAnyPosition(5, 5);
    list.printLL();
    list.deletionAtFirst();
    list.deletionAtLast();
    list.deletionAtAnyWhere(3);
    list.printLL();
  }
}
