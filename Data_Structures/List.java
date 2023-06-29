package Data_Structures;

import java.util.Scanner;
class LinkedList
{
    Node head = null;
    class Node
    {
        int data;
        Node next;
        Node(int n){

            data = n;
            next = null;
        }
    }
    void append(int n)
    {
        // 1. Create Memory for node.
        // 2. Initialize the node segments.

        Node newnode = new Node(n); // newnode = #1000 is assigned to newnode.

        // 3. Create a link.

        if(head == null)
        {
            head = newnode;
        }
        else
        {
            // Node Connection
            //
            Node temp = head;
            while (temp.next !=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
            System.out.println(temp.data);
        }
    }

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n;
        do {
            n = in.nextInt();   // First value= 10 second value =20 third value = 30
            if(n>0)
            {
                list.append(n);
            }
        }while(n>0);
    }
}
}