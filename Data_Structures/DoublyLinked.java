package Data_Structures;

//package Data_Structures;

import java.util.Scanner;

class DLinked{

    Node head = null;

    class Node{
        int data;
        Node pre,link;

        Node(int n)
        {
            data = n;
            link = null;
            pre = null;
        }
    }

    void append(int n)
    {
        Node newnode = new Node(n);

        if(head==null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.link != null)
            {
                temp = temp.link;
            }
            // last node to new node
            temp.link = newnode;

            // new node to last node
            newnode.pre = temp; //1. 1000 //2. 2000
        }
    }

    void printlist(){

        Node temp = head;
        System.out.print("Original Order: ");

        // find the last node
        while (temp.link != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.print("\nReverse Order: ");
        while (temp!= null)
        {
            System.out.print(temp.data+" ");
            temp = temp.pre;
        }

    }
}

public class DoublyLinked {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        DLinked s = new DLinked();
        do {
            n = in.nextInt();
            if(n>0)
            {
                s.append(n);
            }
        }while (n>0);
        s.printlist();
    }
}
