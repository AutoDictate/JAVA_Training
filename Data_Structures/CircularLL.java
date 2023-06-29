package Data_Structures;

import java.util.Scanner;

class LinkedListC{

    Node head = null;
    class Node{
        int data;
        Node next;

        Node(int n)
        {
            data = n;
            next = null;
        }
    }

    void append(int n)
    {
        if(n!=-1)
        {
            Node newnode = new Node(n);

            if (head == null) {
                head = newnode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }
        else
        {
            Node temp = head;
            while(temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    void print()
    {
        Node temp = head;
        while(temp.next !=head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
public class CircularLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedListC l = new LinkedListC();
        int n;
        do {
            n = in.nextInt();
            l.append(n);
        }while(n>0);
        l.print();
    }
}
