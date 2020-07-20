package com.company;

import java.util.List;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    //Abstract methods
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    //Getters
    public Object getValue() {
        return value;
    }

    //Setters
    public void setValue(Object value) {
        this.value = value;
    }
}
