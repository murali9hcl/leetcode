package ds.linkedlist;

public class SingleLinkedList {
    static Node head;
   public static void insert(int data) {
       Node newNode = new Node(data);
       if(head == null) {
           head = newNode;
       } else {
           Node current = head;
           while(current.next != null) {
               current = current.next;
           }
           current.next = newNode;
       }
   }

  public static void delete(int key){
      Node current = head;
      Node prev = null;

      if(current != null && current.data == key) {
          head = current.next;
      }else {
          while(current != null && current.data != key) {
              prev = current;
              current = current.next;
          }
          if(current != null) {
              prev.next = current.next;
              System.out.println("element found and deleted");
          }
          if(current == null) {
              System.out.println("element not found");
          }
      }
  }

  public static void deleteAll() {
       if(head != null) {
           head = null;
       }
  }

   public static void print(){
       Node current = head;
       while(current != null) {
           System.out.println("data is " + current.data);
           current = current.next;
       }
   }

    public static boolean search(int element){
       boolean result = false;
        Node current = head;
        while(current != null) {
            if(current.data == element){
                return true;
            }
            current = current.next;
        }
        return result;
    }



    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(8);
        deleteAll();
        //delete(2);
        //System.out.println(search(10));
        print();
    }
}
