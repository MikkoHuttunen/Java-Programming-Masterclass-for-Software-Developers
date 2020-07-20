package com.company;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        //Create a String data array to avoid typing loads of addItem instructions:
        String stringData = "5 8 7 3 1 6 4 9 2";
        //String stringData = "Helsinki Stockholm Berlin London Paris Tokyo California Berlin";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.additem(new Node(s));
        }

        tree.traverse((tree.getRoot()));
        tree.removeItem(new Node("3"));
        tree.traverse((tree.getRoot()));

        tree.removeItem(new Node("5"));
        tree.traverse((tree.getRoot()));

        tree.removeItem((new Node("0")));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse((tree.getRoot()));

        tree.removeItem(new Node("9"));
        tree.traverse((tree.getRoot()));
        tree.removeItem(new Node("8"));
        tree.traverse((tree.getRoot()));
        tree.removeItem(new Node("6"));
        tree.traverse((tree.getRoot()));
        tree.removeItem(tree.getRoot());
        tree.traverse((tree.getRoot()));
        tree.removeItem((tree.getRoot()));
        tree.traverse((tree.getRoot()));
    }
}
