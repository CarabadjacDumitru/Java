package OOP_Part2.PersonalLinkedList;

import java.util.Objects;

public class Node extends ListItem {

    public Node(Objects item) {
        super(item);
    }

    @Override
    protected ListItem setNext(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    protected ListItem setPrev(ListItem item) {
        this.prevItem = item;
        return this.prevItem;
    }

    @Override
    protected ListItem Next() {

        return this.nextItem;
    }

    @Override
    protected ListItem Prev() {
        return this.prevItem;
    }
}
