package Data_Structures;


import java.util.Scanner;

class Linked2{

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
            //System.out.println(head + " uuu");
        }
        else
        {
            Node temp = head;
            while(temp.link!=null)
            {
                temp = temp.link;
            }
            temp.link = newnode;
            //System.out.println("Data : "+temp.data+" \n"+"Address : "+ temp.link);
        }
    }
    void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
    }
    void swap1(int p,int v)
    {
        Node temp = head;
        int c=0;
        while(temp!=null)
        {
            ++c;
            if(c==p)
            {
                temp.data = v;
            }
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
    }

}

public class ListSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        Linked2 list = new Linked2();
        do {
            n= in.nextInt();
            if(n>0)
            {
                list.append(n);
            }
        }while(n>0);
        int p = in.nextInt();
        int v = in.nextInt();
        System.out.println("Before Insertion:");
        list.print();
        System.out.println("\nAfter Insertion:");
        list.swap1(p,v);
    }
}
