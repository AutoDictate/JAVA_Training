package Data_Structures;

import java.util.Scanner;

class DoubleD{

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
    int check(int del,int n)
    {
        Node temp = head;
        int dd=0;
        while (temp.data!=del)
        {
            dd++;
            temp = temp.next;
            if(temp==null)
            {
               return 0;
            }
        }
        return 1;
    }
    void delete(int del){
        Node temp = head;
        int x=0;
        while(temp.data != del)
        {
            x++;
            temp = temp.next;
        }
        if(temp == head)
        {
            Node temp1 = temp.next;
            temp.next = null;
            temp.pre = null;
            head = temp1;
        }
        else
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

public class DoubleDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,s,c=0,del;
        DoubleD d = new DoubleD();
        System.out.println("Enter the number of elements:");
        n= in.nextInt();
        do {
            c++;
            s = in.nextInt();
            if(s>0)
            {
                d.append(s);
            }
        }while(c<n);
        System.out.println("Enter the element to delete: ");
        del = in.nextInt();
        System.out.println("Before deletion:");
        d.print();
        int ch = d.check(del,n);
        if(ch==1)
        {
            d.delete(del);
            System.out.println("\nAfter deletion:");
            d.print();
        }
        if(ch==0) {
            System.out.println("\nElement "+del+" not found in the list.");
            System.out.println("After deletion:");
            d.print();
        }
    }
}
