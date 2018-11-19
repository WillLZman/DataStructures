public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int inputData){
            inputData = data;
            next = null;
        }
    }

    public void traversePrintList(){
        Node node = head;
        while (node != null){
            System.out.println(node.data+" ");
            node = node.next;
        }
    }

    public Node deleteNode(Node head, int data) {
        Node node = head;
        if(node.data == data){
            return head.next;
        }
        while (node.next != null){
            if(node.next.data == data){
                node.next = node.next.next;
                return head;
            }
            node = node.next;
        }
        return head;
    }


}
