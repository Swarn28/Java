package LinkedList;

public class CheckPalindrome {


    Node leftListNode = null;
    Node rightListNode = null;

    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedList mainList = new LinkedList(head);
        mainList.addNode(new Node(2));
        mainList.addNode(new Node(3));
        mainList.addNode(new Node(4));
        mainList.addNode(new Node(3));
        mainList.addNode(new Node(2));
        mainList.addNode(new Node(1));

        System.out.println("List is: ");
        mainList.printList(head);
        CheckPalindrome cp = new CheckPalindrome();
        boolean isSame = cp.checkPalindromes(head);
        System.out.println(isSame);
    }


    public boolean checkPalindromes(Node head) {

        /*
         * 1. Find Middle of LL.
         * 2. Divide into 2 halfs, leftList and rightList.
         * 3. Check if both halfs are of same length, if not return false straightway.
         * 3. Reverse the rightList.
         * 4. Compare the leftList and rightList.
         * 5. If they are equal, then it is a palindrome.
         * */
        boolean isPallindrome = false;

        int middleItem = findMiddle(head);
        breakIntoTwoLists(head, middleItem);
        //compare size of leftList and rightList. If same then move ahead, else return false

        if (checkLenOfTwoLists(leftListNode, rightListNode, middleItem)) {
            rightListNode = reverseList(rightListNode);

            isPallindrome = compareLists(leftListNode, rightListNode, middleItem, middleItem-1);
        }
        return isPallindrome;
    }

    public int findMiddle(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        int count = 1;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            count++;
        }
        return count;
    }

    public void breakIntoTwoLists(Node head, int middleLoc) {
        int count = 0;
        Node tempNode = head;
        while (count != middleLoc) {
            tempNode = tempNode.next;
            count++;
        }

        this.leftListNode = head;
        this.rightListNode = tempNode;

    }

    public Node reverseList(Node head) {
        Node next = null;
        Node prev = null;
        Node curr = head;

        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        return curr;
    }


    public boolean compareLists(Node leftHead, Node rightHead,
                                int middleItem, int len) {
        int count = 0;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data == rightHead.data) {
                count++;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }

        if (count == len) {
            return true;
        }


        return false;
    }

    public boolean checkLenOfTwoLists(Node leftHead, Node rightHead, int middleItem) {
        int lenLeft = 0;
        int lenRight = 0;

        Node tempLeftNode = leftHead;
        Node tempRightNode = rightHead;

        while (tempLeftNode.next != null && lenLeft < middleItem - 1) {
            lenLeft++;
            tempLeftNode = tempLeftNode.next;
        }

        while (tempRightNode != null) {
            lenRight++;
            tempRightNode = tempRightNode.next;
        }

        if (lenLeft == lenRight) {
            return true;
        }

        return false;
    }
}
