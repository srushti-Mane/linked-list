package com.linkedlist;

public class PopLast {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(56);
        list.append(70);
        list.show();
        System.out.println();
        list.insertAtMiddle(30);
        list.show();
        System.out.println();
        list.pop();
        list.popLastelement();
        list.show();
    }
}
