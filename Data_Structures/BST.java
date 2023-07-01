package Data_Structures;

import java.util.Scanner;

class Tree
{
    Node root = null;

    class Node {
        int data;
        Node left,right;

        Node(int n){
            data = n;
            left = null;
            right = null;
        }
    }

    void append(int n){

        Node newnode = new Node(n);
        if(root == null)
        {
            root = newnode;
        }
        else
        {
            Node temp = root;

            while(true)
            {
                if(n < temp.data)        // left side store     n -> input value  temp.data -> root (Maximum)
                {
                    if(temp.left == null)
                    {
                        temp.left = newnode;
                        break;
                    }
                    else
                    {
                        temp = temp.left;
                    }
                }
                else        // right side store
                {
                    if(temp.right == null)
                    {
                        temp.right = newnode;
                        break;
                    }
                    else
                    {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    void print(Node temp)
    {
        if(temp != null)
        {
            print(temp.left);
            System.out.print(temp.data+" ");
            print(temp.right);
        }
    }
}


public class BST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        Tree t = new Tree();
        do {
            n = in.nextInt();
            if(n>0)
            {
                t.append(n);
            }
        }while (n>0);
        t.print(t.root);
    }
}
