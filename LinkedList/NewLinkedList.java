package LinkedList;

import java.util.Scanner;

public class NewLinkedList {

    // delete node at ith position
    public static NewNode<Integer> deleteAt_ithNode(NewNode<Integer> head, int pos) {
        NewNode<Integer> temp = head;
        if (pos == 0 && temp.next == null) {
            head = null;
            System.out.println("There is no Node in LinkedList. ");
            return head;
        } else if(pos == 0 && temp.next != null){
            head = temp.next;
            return head;
        }
         else {
            int count = 1;
            while (count < pos - 1 ) {
                count++;
                temp = temp.next;
            }
            if( temp.next.next != null){   
                temp.next = temp.next.next;
            } else{
                temp.next = null;
            }
        }
       return head;
    }

    // insert at ith node
    public static NewNode<Integer> insertAt_ithNode(NewNode<Integer> head, int elts, int pos) {
        NewNode<Integer> curr = new NewNode<Integer>(elts);
        NewNode<Integer> temp = head;
        if (pos == 0) {
            curr.next = head;
            head = curr;
            return head;
        } else {
            int c = 1;
            while (c < pos - 1 && temp != null) {
                temp = temp.next;
                c++;
            }

            if (temp != null) {
                curr.next = temp.next;
                temp.next = curr;
            }
        }
        return head;
    }

    // insert element at last
    public static void insert(NewNode<Integer> head, int elts) {
        NewNode<Integer> curr = new NewNode<Integer>(elts);
        NewNode<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = curr;
        temp = curr;
    }

    // print ith node in linked list
    public static void print_ith_node(NewNode<Integer> head, int pos) {
        NewNode<Integer> temp = head;
        for (int count = 0; count < pos; count++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // calculate length
    public static void calculateLength(NewNode<Integer> head) {
        int len = 0;
        NewNode<Integer> temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        System.out.println("\n linked length : " + len);
    }

    // take input in linked list
    public static NewNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        NewNode<Integer> head = null;
        NewNode<Integer> tail = null;

        while (data != -1) {
            NewNode<Integer> curr = new NewNode<Integer>(data);
            if (head == null) {
                head = curr;
                tail = curr;
            } else {
                tail.next = curr;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        sc.close();
        return head;
    }

    // print linked list
    public static void print(NewNode<Integer> head) {
        NewNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NewNode<Integer> head = takeInput();
        print(head);

        // calculateLength(head);

        // print_ith_node(head, 2);
        // insert(head, 80);
        // head = insertAt_ithNode(head, 80, 0);
        head = deleteAt_ithNode(head, 0);
        print(head);

    }
}
