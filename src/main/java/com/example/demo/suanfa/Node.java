package com.example.demo.suanfa;

public class Node {
    private  Node next;
    private  Object data;
    public Node(Object data){
        this.data=data;
    }
    public Object getData(){
        return data;
    }
    public void setNext(Node node){
        this.next=node;
    }
    public Node getNext() {
        return next;
    }
    public static Node reverseNode(Node node){
        if(node==null||node.next==null){
            return node;
        }
        Node next=node.next;
        node.next=null;
       Node newNode= reverseNode(next);
       next.next=node;
        return newNode;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        Node h=head;
        while(null!=h){
            System.out.print(h.getData());
            if(null!=h.next){
                System.out.print("->");
            }
            h=h.next;
        }
        head=reverseNode(head);
        System.out.println("");
        while(null!=head){
            System.out.print(head.getData());
            if(null!=head.next){
                System.out.print("->");
            }
            head=head.next;
        }
       /* Node n=head.getNext();
        System.out.print(n.getData());*/

    }
}
