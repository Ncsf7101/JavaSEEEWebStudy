package com.rqiang.Java11;

class Exs{
    class Node{
        public int date;
        public Node left;
        Node right;

        Node(int a){
            date = a;
        }

        public void addNode(Node node){
            if(this.date > node.date){
                if(this.left != null){
                    this.left.addNode(node);
                }else{
                    this.left = node;
                }
            }else{
                if(this.right != null){
                    this.right.addNode(node);
                }else{
                    this.right = node;
                }
            }
        }

        public void printNode(){
            if(this.left != null){
                this.left.printNode();
            }
            System.out.print(this.date + " ");
            if (this.right != null){
                this.right.printNode();
            }
        }
    };
    public Node node;
    public void add(int a){
        Node a1 = new Node(a);
        if(this.node != null){
            this.node.addNode(a1);
        }else{
            this.node = new Node(1);
            this.node = a1;
        }
    }
    public void print(){
        this.node.printNode();
    }
}


public class ERCS {
    public static void main(String[] args) {
        Exs ex = new Exs();
        ex.add(2);
        ex.add(1);
        ex.add(12);
        ex.add(44);
        ex.add(22);
        ex.add(5);
        ex.print();
    }
}
