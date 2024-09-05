package LinkedList;

public class InsertInSortedLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        LinkedList list = new LinkedList(head);

        Node first = new Node(31);
        Node second = new Node(46);
        Node third = new Node(48);
        Node fourth = new Node(57);
        Node fifth = new Node(59);
        Node sixth = new Node(79);
        Node seventh = new Node(88);
        list.addNode(first);
        list.addNode(second);
        list.addNode(third);
        list.addNode(fourth);
        list.addNode(fifth);
        list.addNode(sixth);
        list.addNode(seventh);

        head = InsertInSortedLL.insert(head, new Node(1));

        list.printList(head);
    }

    public static Node insert(Node head, Node newNode){
        Node curr, next, temp = null;
        curr = head;
        next = curr.next;

        if(newNode.data < head.data){
            temp = head;
            head = newNode;
            head.next = temp;
            return head;
        }

        while(curr.next !=null){
            if(curr.data < newNode.data && next.data > newNode.data){
                temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
            }
            curr = next;
            next = curr.next;
        }
        if(newNode.data > curr.data){
            curr.next = newNode;
        }

        return head;
    }
}
