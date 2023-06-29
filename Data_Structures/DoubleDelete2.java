package Data_Structures;

import java.util.Scanner;

class DoubleD2{

    Node head = null;
    class Node{
        int data;
        Node pre,next;

        Node(int n){
            data = n;
            pre = null;
            next = null;
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
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.pre = temp;
        }
    }
    void delete(int del){
        Node temp = head;
        int x=0;
        while(x!=del)
        {
            x++;
            temp = temp.next;
            if(temp == null)
            {
                x=-1;
                break;
            }
        }
        if(x!=-1)
        {
            Node temp1 = temp.pre;
            Node temp2 = temp.next;

            temp.pre = null;
            temp.next = null;

            temp1.next = temp2;
            temp2.pre = temp1;
        }
    }
    void print()
    {
        Node temp = head;
        while(temp.next !=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}

public class DoubleDelete2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,s,c=0,del;
        DoubleD2 d = new DoubleD2();
        n= in.nextInt();
        do {
            c++;
            s = in.nextInt();
            if(s>0)
            {
                d.append(s);
            }
        }while(c<n);
        del = in.nextInt();
        System.out.println("Original List:");
        d.print();
        d.delete(del);
        System.out.println("\nList after deleting node at index "+del+":");
        d.print();

    }
}

