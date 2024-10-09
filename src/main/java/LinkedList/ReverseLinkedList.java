package LinkedList;


public class ReverseLinkedList {

    public static void main(String[] args) {

        Node head = new Node(1);
        LinkedList list = new LinkedList(head);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        list.addNode(second);
        list.addNode(third);
        list.addNode(fourth);

        list.printList(head);

        Node newHead = reverseList(head);

        System.out.println("After reversal..");

        LinkedList list2 = new LinkedList(newHead);

        list2.printList(newHead);
    }

    public static Node reverseList(Node head){

        Node next,prev = null;
        Node curr = head;

        while(curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        return curr;

    }
}
