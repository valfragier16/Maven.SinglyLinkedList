package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList singly;

    @Before
    public void init() {
        singly = new SinglyLinkedList();
        singly.add(1);
        singly.add(6);
        singly.add(2);
        singly.add(5);
        singly.add(3);
        singly.add(4);
    }

    @Test
    public void TestAdd() {
        singly.add(456);
        Assert.assertTrue(singly.contains(1));
        Assert.assertTrue(singly.contains(456));
        Assert.assertTrue(singly.contains(6));
    }

    @Test
    public void TestRemove() {
        singly.remove(2);
        Assert.assertFalse(singly.contains(2));
    }

    @Test
    public void TestContains(){
        Assert.assertTrue(singly.contains(1));
    }

    @Test
    public void TestFind(){
        Assert.assertEquals(6, singly.find(4));
        Assert.assertEquals(2, singly.find(6));
        Assert.assertEquals(1, singly.find(1));
    }

    @Test
    public void TestSize(){
        Assert.assertEquals(6,singly.size());
    }
    @Test
    public void TestSize2(){
        singly.add(7);
        singly.add(10);
        singly.add(22);
        singly.add(8);
        Assert.assertEquals(10,singly.size());
    }

    @Test
    public void TestGet(){
        Assert.assertEquals(6,singly.get(2));
        Assert.assertEquals(5,singly.get(4));
    }
}
