package LinkedList;

import java.util.*;

public class LinkedListUse {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        // System.out.println("n1 "+n1+ " data"+n1.data+" next "+n1.next);
        n2.next = n3;
        // System.out.println("n2 "+n2+ " data"+n2.data+" next "+n2.next);
        n3.next = n4;
        // System.out.println("n3 "+n3+ " data"+n3.data+" next "+n3.next);
        // System.out.println("n4 "+n4+ " data"+n4.data+" next "+n4.next);

        return n1;
    }

    // incement every node element in linkedlist
    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    // print linked list
    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    // Calculate length
    public static int calcLength(Node<Integer> head) {
        // here temp create reference only
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    // Print ith node
    public static void print_ithNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (c == i) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    // take input in linked list
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currNode = new Node<Integer>(data);
            if (head == null) {
                head = currNode;
                tail = head;

            } else {
                // Node<Integer> tail = head;
                // while(tail.next != null){
                // tail = tail.next;
                // }
                tail.next = currNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        sc.close();
        return head;
    }

    // search element in linkedlist
    public static void search(Node<Integer> head, int value) {
        int pos = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (value == temp.data) {
                System.out.println("pos : " + pos);
                return;
            }
            pos++;
            temp = temp.next;
        }
        System.out.println("not found");
    }

    // add element at last
    public static void addElement(Node<Integer> head, Node<Integer> newElts) {
        Node<Integer> tail = head;
        // tail.next = newElts;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newElts;
        tail = tail.next;
        print(head);
    }

    // insert node in ith position
    public static Node<Integer> addInIthPos(Node<Integer> head, int elem, int pos) {
        Node<Integer> newNode = new Node<>(elem);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;

        } else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
            return head;
        }
    }

    //delete node from last
    public static void deleteNode(Node<Integer> head, int pos){
        Node<Integer> prev = head;
        int count = 0;
        while(count <= pos - 1 && prev != null){
            count++;
            prev = prev.next;
        }
        if (prev != null) {
            prev = prev.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();

        deleteNode(head, 2);

        // head = addInIthPos(head, 80, 0);

        // int addVal = s.nextInt();
        print(head);
        // System.out.println();
        // Node<Integer> newElts = new Node<Integer>(addVal);
        // addElement(head, newElts);
        // search(head, 3);
        // increment(head);
        // int sVal = s.nextInt();
        // print_ithNode(head, 2);
        // System.out.println("Linkedlist length : "+LL);
        // int LL = calcLength(head);
        // Node<Integer> head = createLinkedList();
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
