package LinkedList;

public class FindMiddleLL {

    public static void main(String[] args) {
        Node head = new Node(2);
        LinkedList list = new LinkedList(head);

        Node first = new Node(31);
        Node second = new Node(46);
        Node third = new Node(34);
        Node fourth = new Node(57);
        Node fifth = new Node(22);
        Node sixth = new Node(79);
        Node seventh = new Node(43);
        list.addNode(first);
        list.addNode(second);
        list.addNode(third);
        list.addNode(fourth);
        list.addNode(fifth);
        list.addNode(sixth);
        list.addNode(seventh);

        FindMiddleLL.findMiddle(head);
    }

    public static void findMiddle(Node head){
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        System.out.println("Middle is: " +slowPtr.data);
    }
}
