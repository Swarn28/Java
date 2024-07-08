package LinkedList;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        Node head = new Node(23);
        LinkedList firstList = new LinkedList(head);

        Node first = new Node(54);
        Node second = new Node(66);
        Node third = new Node(78);
        firstList.addNode(first);
        firstList.addNode(second);
        firstList.addNode(third);


        Node headSecond = new Node(12);
        LinkedList secondList = new LinkedList(headSecond);
        Node first_2 = new Node(24);
        Node second_2 = new Node(57);
        Node third_2 = new Node(69);
        secondList.addNode(first_2);
        secondList.addNode(second_2);
        secondList.addNode(third_2);


        firstList.printList(head);
        System.out.println(" ");
        secondList.printList(headSecond);
        System.out.println(" ");
        Node temp = null;

        mergeTwoLists(head, headSecond,temp);

    }

    public static void mergeTwoLists(Node first, Node second, Node temp){
        LinkedList llFirst = new LinkedList(first);
        LinkedList llSecond = new LinkedList(second);

        Node newList;

        if(first == null){
            llSecond.printList(second);
        }

        if(second == null){
            llFirst.printList(first);
        }

        if(first.data <= second.data){
            temp = first;
            first = temp.next;
        }

        if(second.data <= first.data){
            temp = second;
            second = temp.next;
        }

        newList = temp;

        while(first!=null && second != null){

            if(first.data <= second.data){
                temp.next = first;
                temp = first;
                first = temp.next;
            }

            if(second.data <= first.data){
                temp.next = second;
                temp = second;
                second = temp.next;
            }
        }

        if(first==null){
            temp.next = second;
        }

        if(second == null){
            temp.next = first;
        }

        llFirst.printList(newList);

    }
}
