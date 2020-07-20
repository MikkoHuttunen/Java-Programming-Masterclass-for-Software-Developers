package com.company;

public interface NodeList {

    ListItem getRoot();
    boolean additem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
