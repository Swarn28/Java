package LinkedList;

public class FindNthNodeFromLast {

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

        int N = 3;
        int totalLength = list.totalLength(head);
        System.out.println("total length is: "+ totalLength);
        FindNthNodeFromLast.findNth(N,totalLength,head);
    }

    public static void findNth(int N, int len, Node head){
        Node node = head;

        int reqdCount = len - N ;
        int count =0;

        while(count < reqdCount){
            node = node.next;
            count++;
        }

        System.out.println("Found node is: " +node.data);
    }
}
