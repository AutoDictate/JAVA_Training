package Data_Structures;

import java.util.Scanner;

class Linked{

    Node head = null;

     class Node{
        int data;
        Node link;

        Node(int n)
        {
            data = n;
            link = null;
        }
    }
    void append(int n)
    {
        Node newnode = new Node(n);

        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while (temp!=null)
            {
                temp = temp.link;
            }
            temp.link = newnode;
        }
    }
}

public class List2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        Linked list = new Linked();
        do {
            n= in.nextInt();
            if(n>0)
            {
                list.append(n);
            }
        }while(n>0);
    }
}
