package OOP_Part2.PersonalLinkedList;


public class MyLinkedList {
    private ListItem root = null;
    private int size = 0;

    public MyLinkedList(ListItem newItem) {
        this.root = newItem;
    }


    public void addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
        }

        if (this.root.Right() == null) {
            newItem.setLeft(this.root);
            //newItem.setRight(null);
            this.root.setRight(newItem);
        }
        if (this.root.Left() == null) {
            //newItem.setLeft(null);
            newItem.setRight(this.root);
            this.root.setLeft(newItem);
        } else {
            ListItem rightItemm = this.root.Right();
            this.root.setRight(newItem);
            newItem.setLeft(this.root);
            rightItemm.setLeft(newItem);
            newItem.setRight(rightItemm);
        }
        size++;
    }

    public boolean removeItem(ListItem remItem) {
        if (this.root == null) {
            return false;
        }

        if (this.root.Right() == null) {
            this.root= this.root.Left();
        }
        if (this.root.Left() == null) {
            this.root = this.root.Right();
        } else {
            this.root.Right().setLeft(this.root.Left());
            this.root.Left().setRight(this.root.Right());
        }
        size--;
        return true;
    }


    public void PrintList() {
        ListItem current = this.root;
        while (current != null) {
            current.DisplayValue();
            current = current.Right();
        }

    }
}
