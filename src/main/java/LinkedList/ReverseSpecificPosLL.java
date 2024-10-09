package LinkedList;

/*
* https://leetcode.com/problems/reverse-linked-list-ii/
*
*
* */
public class ReverseSpecificPosLL {

    public static void main(String[] args) {

        Node head = new Node(1);
        LinkedList list1 = new LinkedList(head);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        int left = 2;
        int right = 4;

        list1.addNode(second);
        list1.addNode(third);
        list1.addNode(fourth);
        list1.addNode(fifth);
        list1.printList(head);

        reverseSubList(head,left,right);

    }

    public static void reverseSubList(Node head, int left, int right){

        int count = 1;
        Node mainPrev = null;
        Node mainNext = null;
        Node mainCurr = head;
        Node headSub = null;
        Node tailSub = null;

        // fetch mainPrev and store
        while(count<left){
            mainPrev = mainCurr;
            mainCurr = mainCurr.next;
            headSub = mainCurr;
            count++;
        }

        //fetch mainNext and store

        while(count!=right){
            mainCurr = mainCurr.next;
            tailSub = mainCurr;
            count++;
        }
        mainNext = mainCurr.next;

        System.out.println(mainNext.data+" is mainNext and main prev is : "+mainPrev.data);


        //Take out the sublist and reverse it.
        Node tempCurr = headSub;
        Node next, prev = null;
        int tempCount = 0;
        while(tempCurr.data!=mainNext.data){
            next = tempCurr.next;
            // For handling that the first node of the sublist point to null on reversal.
            if(count!=0) {
                tempCurr.next = prev;
            }
            else{
                tempCurr.next = null;

            }
            count++;
            prev = tempCurr;
            tempCurr = next;
        }

        // Reattach the lists correctly..

        mainPrev.next = prev ;
        Node firstHalf = mainPrev;

        Node tempNode = firstHalf;

        while(tempNode.next!=null){
            tempNode = tempNode.next;
        }

        tempNode.next = mainNext;

        LinkedList finalList = new LinkedList(firstHalf);
        finalList.printList(firstHalf);

       // System.out.println(firstHalf.data);

    }

}
