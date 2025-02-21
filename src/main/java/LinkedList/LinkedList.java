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

    public int totalLength(Node head){
        Node curr = head;
        int len =0;

        if(head ==null){
            return 0;
        }

        while(curr !=null){
            curr = curr.next;
            len++;
        }

        return len;
    }
}
