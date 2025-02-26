package com.company;

public class IntNode {
     private int value;
     private IntNode next;

     public IntNode (int value){
        this.value = value;
        this.next = null;
    }
    public IntNode (int value, IntNode next){
        this.value = value;
        this.next = next;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasNext()
    {
        return this.next!=null;
    }

    public String toString()
    {

        return this.value+"->";
    }








}
