package temp;

import java.util.*;
public class Main {


    public static void main(String args[]) {
        // Create an array list
        LinkedList<String> al = new LinkedList<>();

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();




        // Now, display the list backwards
        System.out.println("Modified list backwards: -----------------------------------");

        ListIterator ssss = al.listIterator();
        Object sel = ssss.next();
                sel = ssss.previous();
        do{
            //Object sel = ssss.next();
            System.out.println( ssss.next() + " ");
        }while(ssss.hasNext());

        System.out.println();
    }
}