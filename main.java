package Linkedlist;

public class main {
    public static void main(String[] args) {
        learn1 mylinked = new learn1(4);

        
        mylinked.append(5);
        mylinked.append(24);
        mylinked.append(59);
        mylinked.removelast();
        mylinked.append(88);

        mylinked.gethead();
        mylinked.gettail();
        mylinked.length();
        
        mylinked.printlist();
        
    }
}

