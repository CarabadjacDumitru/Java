package OOP_Part2.PersonalLinkedList;

import java.util.Objects;


public abstract class ListItem {
    protected ListItem nextItem;
    protected ListItem prevItem;
    protected Object value;

    public ListItem(Objects item) {
        this.value = item;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    abstract ListItem setNext(ListItem item);

    abstract ListItem setPrev(ListItem item);

    abstract ListItem Next();

    abstract ListItem Prev();
}