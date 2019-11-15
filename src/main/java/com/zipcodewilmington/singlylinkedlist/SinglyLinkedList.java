package com.zipcodewilmington.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{
    Node head = null; // head of list

    private class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }

    }

    public void add(int item) {
        Node n = head;
        if(n == null){ // added first item to list
            head = new Node(item);
        }
        else{
            while(n.next != null){
                n = n.next;
            }
            n.next = new Node(item);
        }
    }


    public void remove(int key) {
        // store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        } // Search for the ket to be deleted
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        } // if key was not present in linked list
        if(temp == null) throw new RuntimeException("cannot delete");

        // delete temp node
        prev.next = temp.next;

    }

    public boolean contains() {
        return true;
    }

    public int find() {
        return 1;
    }

    public int size() {
        return 1;
    }

    public int get() {
        return 1;
    }

//    public LinkedList copy() {
//        return list;
//    }

    public void sort() {

    }
}
