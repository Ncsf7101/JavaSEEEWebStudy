package com.rqiang.Java11;

class Exs2{
    class Node{
        private String date;
        public Node left;
        Node right;


        public void addNode(Node node){
            if(node.date.compareTo(this.date) < 0){
                if(this.left != null){
                    this.left.addNode(node);
                }else{
                    this.left = node;
                }
            }
            if(node.date.compareTo(this.date) > 0){
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

    public Node root;
    public void add(String newDate){
        Node newNode = new Node();
        newNode.date = newDate;
        if(this.root != null){
            root.addNode(newNode);
        }else{
            root = newNode;
        }
    }
    public void print(){
        this.root.printNode();
    }
}


public class ERCS2 {
    public static void main(String[] args) {
        Exs2 ex = new Exs2();
        ex.add("aa");
        ex.add("bb");
        ex.add("cc");
        ex.add("zz");
        ex.add("ss");
        ex.add("ss");
        System.gc();

        ex.print();
    }
}
