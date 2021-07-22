// Bobby Pappas
// COP 3503, Fall 2020
// NID: 3930049
// ====================
// SkipList: SkipList.java
// ====================

import java.io.*;
import java.util.*;

class Node<anything>
{
    public Node<anything> next;
    public int height;
    public anything data;

    // Creates node of data
    Node(anything data)
    {
        this.data = data;
    }
    
    // Creates node of height
    Node(int height)
    {
        this.next = null;
        this.height = height;
    }

    // Creates node of data, height
    Node(anything data, int height)
    {
        this.data = data;
        this.next = null;
        this.height = height;
    }

    // Returns current value
    public anything value()
    {
        return this.data;
    }

    // Returns current height
    public int height()
    {
        return this.height;
    }

    //not correct at all :-)
    public Node next(int level)
    {
        if(level < 0 || level > this.height - 1)
            return null;

        return this.next;
    }
}

public class SkipList<anything extends Comparable<anything>>
{
    Node<anything> head;
    int height;
    int size;

    // SkipList constructor
    SkipList()
    {
        head = new Node<>(1);
        this.height = 1;
        this.size = 0;

    }

    // Create SkipList with height included
    SkipList(int height)
    {   
        if(height > 1)
        {
            head = new Node<>(height);
            this.height = height;
        }

        else
        {
            head = new Node<>(1);
            this.height = 1;
        }

        this.size = 0;

    }

    // Returns current node size
    public int size()
    {
        return this.size;
    }

    // Returns current node height
    public int height()
    {
        return this.height;
    }
    
    // Returns current node head
    public Node<anything> head()
    {
        return this.head;
    }

    public void setNext(int level, Node<anything> node)
    {

    }    

    // Inserts data into SkipList **not completed as you can see**
    public void insert(anything data)
    {
        Node<anything> curr = this.head;
        
        // Traverse through next Node pointers to see where data should be placed
        while(curr.next != null && data.compareTo(curr.data) > 0)
        {
            curr = curr.next;
        }

        curr.data = data;
    
    }

    // Inserts data with height into SkipList
    public void insert(anything data, int height)
    {
        Node<anything> curr = this.head;
        
        // Traverse through next Node pointers to see where data should be placed
        while(curr.next != null && data.compareTo(curr.data) > 0)
        {
            curr = curr.next;
        }

        curr.data = data;
        
    }

    public static double difficultyRating() 
    {
        return 5.0;
    }

    public static double hoursSpent() 
    {
        return 6.0;
    }
}
