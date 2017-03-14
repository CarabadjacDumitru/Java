package Mobile;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private  static MobilePhone myMobile = new MobilePhone("0696968965");

    public static void main(String[] args) {
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

                    PrintContacts();
                    break;
                case 2:
                    AddContact();
                    break;
                case 3:
                    ModifyContact();
                    break;
                case 4:
                    RemoveContact();
                    break;
                case 5:
                    SearchContact();
                    break;
                case 9:
                    quit = true;
                    break;
            }

        }
    }
    public static void PrintContacts(){
        myMobile.PrintContacts();
    }

    public static void AddContact(){
        String name, tel;
        System.out.println("Please write the Name of the Contact");
        name = scanner.next();
        System.out.println("Please write the Telephone of the Contact");
        tel = scanner.next();

        myMobile.AddContact(new Contact(name,tel));

    }

    public static void ModifyContact(){
        String oldContactname, newContactName, newContactTel;
        Contact oldContact;

        System.out.println("Please write the Name of the Contact you whant to modify");
        oldContactname = scanner.next();
        oldContact = myMobile.getContact(myMobile.SearchContact(oldContactname));

        System.out.println("Please write the Name of the NEW Contact");
        newContactName = scanner.next();
        System.out.println("Please write the Telephone of the NEW Contact");
        newContactTel = scanner.next();


        myMobile.ModifyContact(oldContact,new Contact(newContactName,newContactTel));
    }

    public static void RemoveContact(){
        String remove;
        System.out.println("Please write the Name of the Contact to REMOVE");
        remove = scanner.next();
        myMobile.RemoveContact(remove);
    }

    public static void SearchContact(){
        String search;
        System.out.println("Please write the Name of the Contact you want to search");
        search = scanner.next();


        myMobile.SearchContact(search);
    }




    public static void PrintInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choise options");
        System.out.println("\t 1 - To Print the list of Contacts");
        System.out.println("\t 2 - To add an Contact ");
        System.out.println("\t 3 - To modify an Contact");
        System.out.println("\t 4 - To remove an Contact");
        System.out.println("\t 5 - To search for an Contact");
        System.out.println("\t 9 - To exist");
    }
}
