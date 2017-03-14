package Mobile;
import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> mobileContacts;

    public MobilePhone(String Number) {
        myNumber = Number;
        this.mobileContacts = new ArrayList<>();
    }

    public void AddContact(Contact toAdd) {
        mobileContacts.add(toAdd);
    }

    public Contact getContact(int indexContact){
        return mobileContacts.get(indexContact);
    }


    public int SearchContact(Contact toAdd) {
        return mobileContacts.indexOf(toAdd);
    }
    public int SearchContact(String contactName) {
        for (int i = 0; i < mobileContacts.size(); i++)
            if (mobileContacts.get(i).getContactName().equals(contactName))
                return i;

        return -1;
    }

    public boolean RemoveContact(String toRemove) {
        Contact findContact = mobileContacts.get(SearchContact(toRemove));
        return RemoveContact(findContact);
    }
    public boolean RemoveContact(Contact toRemove) {
        int findContact = SearchContact(toRemove);
        if (findContact<0)
        {
            System.out.println(toRemove.getContactName() + " was not found");
            return false;
        }
        else {
            mobileContacts.remove(findContact);
            System.out.println(toRemove.getContactName() + " was Deleted");
            return true;
        }
    }

    public boolean ModifyContact(Contact oldContact, Contact newContact) {
        int oldContactPosition = SearchContact(oldContact);
        if (oldContactPosition == -1) {
            System.out.println(oldContact.getContactName() + " was not found");
            return false;
        } else {
            mobileContacts.set(oldContactPosition, newContact);
            System.out.println(oldContact.getContactName() + " was updated");
            return true;
        }
    }

    public void PrintContacts(){
        for (Contact cc: mobileContacts) {
            System.out.println("Contact Name: " +  cc.getContactName() + " with number " + cc.getContactPhone() );
        }
    }


}


