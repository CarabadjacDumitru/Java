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
        rightItem = item;
        return rightItem;
    }

    public ListItem setLeft(ListItem item) {
        leftItem = item;
        return leftItem;
    }

    public ListItem Right() {
        return rightItem;
    }

    public ListItem Left() {
        return leftItem;
    }
}