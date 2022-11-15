package LinkedList;

import java.util.Scanner;

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

    //incement every node element in linkedlist
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    //print linked list
    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
        
    }

    // Calculate length
    public static int calcLength(Node<Integer> head) {
        //here temp create reference only 
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }

        return count;
    }

    //Print ith node
    public static void print_ithNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int c = 0;
        while(temp != null){
            c++;
            if(c == i){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    //take input in linked list
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while(data != -1){
            Node<Integer> currNode = new Node<Integer>(data);
            if(head == null){
                head = currNode;
                tail = head;
                
            } else{
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

    public static void main(String[] args) {

        // Node<Integer> head = createLinkedList();
        Node<Integer> head = takeInput();
        // increment(head);
        print(head);
        // int LL = calcLength(head);
        // System.out.println("Linkedlist length : "+LL);
        // print_ithNode(head, 2);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
