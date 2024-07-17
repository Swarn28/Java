package LinkedList;

public class SegregateOddEven {

    public static void main(String[] args) {

        SegregateOddEven se = new SegregateOddEven();
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
        System.out.println("Non segregated list is: ");
        list.printList(head);
       head = se.segregate(head);
        System.out.println("Segregated list is: ");
        list.printList(head);

    }

    public Node segregate(Node origListStart) {

        /*
         * 1. Create two lists
         * 2. Check if element is odd or even. Add to reqd. list
         * 3. connect end of evenlist with start of odd list
         * 4. return this new list.
         * 5.
         * */

        Node evenStart = null;
        Node evenEnd = null;

        Node oddStart = null;
        Node oddEnd = null;

        Node currentNode = origListStart;

        while (currentNode != null) {
            if (currentNode.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
            }else{
                if(oddStart == null){
                    oddStart = currentNode;
                    oddEnd = oddStart;
                }else{
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode = currentNode.next;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        origListStart = evenStart;
        return origListStart;
    }
}
