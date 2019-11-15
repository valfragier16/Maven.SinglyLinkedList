package com.zipcodewilmington.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{
    Node head = null; // head of list

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public void add(int data) {
        Node n = head;
        if(n == null){ // added first item to list
            head = new Node(data);
        }
        else{
            while(n.next != null){
                n = n.next;
            }
            n.next = new Node(data);
        }
    }

    public void remove(int data) {
        Node current = head;
        if (head.data == data) {
            head = head.next;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while(current != null) {
            if (current.data == data) {
                return true;
            }current = current.next;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int count = 1; // index of Node we are currently looking at
        while(current != null){
            if(current.data == data)
                return count;
            count++;
            current = current.next;
        }
        return count;
    }

    public int size() {
        int length = 0;
        Node current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    public int get(int index) {
        Node current = head;
        int count = 1; // index of Node we are currently looking at
        while(current != null){
            if(count == index)
                return current.data;
            count++;
            current = current.next;
        }
        return -1;
    }

//    public LinkedList copy() {
//
//        return list;
//    }

    public void sort() {

    }
}
