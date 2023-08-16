package org.example.abstractfactory.abstractclass;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }
    public abstract ListItem next();
    public abstract ListItem setNext();
    public abstract ListItem previous();
    public abstract ListItem setPrevious();
    public abstract ListItem compareTo();

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
