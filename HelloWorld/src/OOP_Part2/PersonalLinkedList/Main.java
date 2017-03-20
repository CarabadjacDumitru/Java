package OOP_Part2.PersonalLinkedList;


public class Main {
    public static void main(String[] args) {
        MyLinkedList newList = new MyLinkedList(new ListItem(1));


        newList.addItem(new ListItem(2));
        newList.addItem(new ListItem(3));
        newList.addItem(new ListItem(4));
        newList.addItem(new ListItem(5));
        newList.addItem(new ListItem(6));
        newList.addItem(new ListItem(7));
        newList.addItem(new ListItem(8));
        newList.addItem(new ListItem(9));
        newList.addItem(new ListItem(10));

        newList.PrintList(newList.getRoot());
    }

}
