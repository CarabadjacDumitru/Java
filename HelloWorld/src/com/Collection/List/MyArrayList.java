package com.Collection.List;

import java.util.ArrayList;
import java.util.Scanner;


public class MyArrayList {
    private  static ArrayList<String> myList = new ArrayList<String>();
    private static Scanner scanner= new Scanner(System.in);

    public static void main (String [] args) {
        boolean quit = false;
        int choise = 0;
        PrintInstructions();

        while (!quit) {
            System.out.println("Enter your choise");
            choise = scanner.nextInt();
            switch (choise) {
                case 0:
                    PrintInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    AddItem();
                    break;
                case 3:
                    ModifyItem();
                    break;
                case 4:
                    RemoveItem();
                    break;
                case 5:
                    FindItem();
                    break;
                case 6:
                    FindItem();
                    break;
                case 7:
                   quit =true;
                   break;
            }

        }

    }

    public static void PrintInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choise options");
        System.out.println("\t 1 - To Print the list of grocery items");
        System.out.println("\t 2 - To add an item ");
        System.out.println("\t 3 - To modify an item");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search for an item");
        System.out.println("\t 6 - To add at Position for an item");
        System.out.println("\t 0 - To exist");
    }

    public static void printList(){
        for (String asd:myList) {
            System.out.print(asd + " ");
        }
        System.out.println();
    }

    public static void AddItem(){
        String addItem;
        System.out.println("Please write the Item that you want to add");
        addItem = scanner.next();
        myList.add(addItem);
    }

    public static void AddItemPosition(){
        String addItem;
        System.out.println("Please write the Item that you want to add");
        addItem = scanner.next();
        myList.add(addItem);
    }

    public static void RemoveItem(){
        String remItem;

        System.out.println("Please choose the position of the Item that you want to remove");
        remItem = scanner.next();

         if (myList.remove(remItem))
            System.out.println("Item Removed");
         else
             System.out.println("No such index");
    }

    public static void ModifyItem() {
        int modifyItem = 0;
        String newItem;

        System.out.println("Please choose the position of the Item that you want to modify");
        modifyItem = scanner.nextInt();


        System.out.println("Please choose the position of the Item that you want to modify");
        newItem = scanner.next();

        myList.set(modifyItem, newItem);
        System.out.println("Item Modified");
    }

    public static int FindItem(){

        int findItem = 0;

        System.out.println("Please choose the position of the Item that you want to Find");
        findItem = scanner.nextInt();

        int set =  myList.indexOf(findItem);
        if (set >0) {
            System.out.println("Item found on position " + set);
            return  set;
        }
        else {
            System.out.println("No item found");
            return set;
        }
    }



}
