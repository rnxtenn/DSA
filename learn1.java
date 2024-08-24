package Linkedlist;

public class learn1 {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public learn1(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }
    public void printlist(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
           }
    }

    public void gethead(){
        System.out.println("head:"+head.value);
    }
    public void gettail(){
        System.out.println("tail:"+tail.value);
    }
    public void length(){
        System.out.println("length:"+length);
    }

    public void append(int value){
        Node nwNode = new Node(value);
        if (length==0) {
            head = nwNode;
            tail = nwNode;
        }else{
            tail.next=nwNode;
            tail = nwNode;
        }
        length++;
    }

    public Node removelast(){
        if (length==0) {
            return null;
        }
        Node temp=head;
        Node pre = head;
        while (temp.next!=null) {
            pre = temp;
            temp = temp.next;
        }
        tail =pre;
        tail.next= null;
        length--;
        if (length==0) {
            head = null;
            tail=null;
        }
        return temp;
    }
}