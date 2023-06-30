package Data_Structures;

import java.util.Scanner;
class Stack1
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
    void push(int n)
    {
        // 1. Create Memory for node.
        // 2. Initialize the node segments.

        Node newnode = new Node(n);     // newnode = #1000 is assigned to newnode.

        // 3. Create a link. -> i. Head Connection ii. Node Connection

        if(head == null)
        {
            // Head Connection
            head = newnode;
        }
        else
        {
            // Node Connection
            newnode.next = head;
            head = newnode;
        }
    }
    int pop()
    {
//        Node temp = head.next;
//        head.next = null;
//        head = temp;
//        return temp.data;

        Node temp = head;
        Node temp1 = temp.next;
        temp.next = null;
        head = temp1;
        return temp.data;
    }
    void print()
    {
        Node temp = head;
        while(temp.next !=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
public class Stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack1 list = new Stack1();
        int n,c;
        c = in.nextInt();   // First value= 10 second value =20 third value = 30
        for (int i = 0; i < c; i++) {
            n = in.nextInt();
            list.push(n);
        }
        list.print();

        int ans = list.pop();
        System.out.println("\nTop element is "+ans);
        //System.out.println();
        list.print();
    }
}

