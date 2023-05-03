package LinkedListImpl;

import java.util.Scanner;

public class LinkedList {
    private Node head;

    private class Node {
        private Node next;
        private int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }
    }


    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        System.out.println("Inserted Successfully");

    }

    //todo 5. Java program to delete a node from the beginning of the singly linked list.
    public void deleteFirst() {
        int val = 0;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            val = head.data;
            head = head.next;
        }
        System.out.println("Deleted Node's value is " + val);

    }

    // todo 3. Java program to create singly linked list of n nodes and count the number of nodes.
    public void countNodes() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        System.out.println("Total No of nodes -> " + size);
    }

    //todo 2. Java program to create and display a Singly Linked List
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    //todo 4. Java program to create a singly linked list of n nodes and display it in reverse order.
    public void displayReverse() {
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        display();
    }

    public void displayReverse(Node node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data + " -> ");
    }

    public void list() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to insert Node at the beginning of the list");
        System.out.println("Enter 2 to delete a Node at the beginning of the list");
        System.out.println("Enter 3 to display the count of the nodes");
        System.out.println("Enter 4 to display the values in the linked list");
        System.out.println("Enter 5 to display the values in the linked list in reverse");
        System.out.println("Enter 6 to exit");
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value");
                    int val = sc.nextInt();
                    insertFirst(val);
                    break;
                case 2:
                    deleteFirst();
                    break;
                case 3:
                    countNodes();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    displayReverse(head);
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (choice < 5);

    }


}
