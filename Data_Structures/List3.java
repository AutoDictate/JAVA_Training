package TrickyQues;

import java.util.Scanner;
class Linked
{
    Node head = null;

    class Node {
        // Data members or Instance Variables
        int data;  // user given values stored in "a"
        Node link;  //

        // "Node" constructor for Initialization

        Node(int n) {
            data = n;
            link = null;
        }
    }

    // Member Function

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
            System.out.print(temp.data+" ");
        }
    }
    void printList()
    {
        Node temp = head;
        int max = 0;
        while(temp!=null)
        {
            if(max< temp.data)
            {
                max = temp.data;
            }
            else
            {
                max = max;
            }
            temp= temp.link;
        }
        System.out.println("The maximum mark is "+max+".");
    }

}

public class List3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        Linked s = new Linked();
        do {
            System.out.println("Enter the student mark:");
            n = in.nextInt();
            if(n!=-1)
            {
                s.append(n);
            }
        }while(n>0);
        System.out.println("Enter the students' mark are:");
        s.printList();
    }
}
