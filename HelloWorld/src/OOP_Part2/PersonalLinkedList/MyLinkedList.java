package OOP_Part2.PersonalLinkedList;



public class MyLinkedList {
    private ListItem root = null;
    private int size = 0;

    public ListItem getRoot(){
        return root;
    }

    public MyLinkedList(ListItem newItem) {
        root = newItem;
    }


    public void addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
        }

        if (this.root.Right() == null) {
            newItem.setLeft(root);
            //newItem.setRight(null);
            root.setRight(newItem);
        }
        if (this.root.Left() == null) {
            //newItem.setLeft(null);
            newItem.setRight(root);
            root.setLeft(newItem);
        } else {
            ListItem rightItemm = root.Right();
            root.setRight(newItem);
            newItem.setLeft(root);
            rightItemm.setLeft(newItem);
            newItem.setRight(rightItemm);
        }
        size++;
    }

    public boolean removeItem(ListItem remItem) {
        if (root == null) {
            return false;
        }

        if (root.Right() == null) {
            root= root.Left();
        }
        if (root.Left() == null) {
            root = root.Right();
        } else {
            root.Right().setLeft(root.Left());
            root.Left().setRight(root.Right());
        }
        size--;
        return true;
    }


    public void PrintList(ListItem printRoot) {
        ListItem current = printRoot;
        while (current != null) {
            current.DisplayValue();
            current = current.Right();
        }

    }
}
