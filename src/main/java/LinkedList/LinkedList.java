package LinkedList;

public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void addNode(Node newNode){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList(Node head){
        var temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
}
