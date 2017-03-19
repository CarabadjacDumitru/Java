package OOP_Part2.PersonalLinkedList;


public class ListItem {

    private ListItem leftItem = null;
    private ListItem rightItem = null;
    private int value;


    public ListItem(int item) {
        this.value = item;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void DisplayValue() {
        System.out.println(value);
    }

    public int compareTo(int toCompare) {
        return Integer.compare(this.value, toCompare);
    }


    public ListItem setRight(ListItem item) {
        this.rightItem = item;
        return this.rightItem;
    }

    public ListItem setLeft(ListItem item) {
        this.leftItem = item;
        return this.leftItem;
    }

    public ListItem Right() {
        return this.rightItem;
    }

    public ListItem Left() {
        return this.leftItem;
    }
}