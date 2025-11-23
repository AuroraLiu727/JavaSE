package com.aurora.set.ListInterface;

public class LinkedListSimulate {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node jerry = new Node("jerry");

        //链接节点
        jack.next = tom;
        tom.next = jerry;
        jerry.pre = tom;
        tom.pre = jack;

        Node first = jack;  //头节点
        Node last = jerry;  //尾节点

        //从头到尾遍历
        System.out.println("==========从头到尾遍历========");
        Node node = first;
        while (node != null) {
            System.out.println(node);
            node = node.next;
        }

        //从尾到头遍历
        System.out.println("==========从尾到头遍历============");
        node = last;
        while (node != null) {
            System.out.println(node);
            node = node.pre;
        }

        //插入对象
        //在tom和jerry之间插入一个smith
        Node smith = new Node("smith");
        smith.next = jerry;
        smith.pre = tom;
        tom.next = smith;
        jerry.pre = smith;

        //再次从头到尾遍历
        System.out.println("==========再次从头到尾遍历========");
        node = first;
        while (node != null) {
            System.out.println(node);
            node = node.next;
        }
    }
}
