package com.shuzijun.leetcode.editor.assist;

public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(){

    }
    public ListNode(int x) {
        setValue(x);
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
