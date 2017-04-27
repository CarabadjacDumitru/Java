package com.Classes.Mobile;

public class Contact {
    private String contactName ;
    private String contactPhone;

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }


    public Contact(String contactName, String contactPhone) {
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public Contact CreateNewContact(String contactName, String contactPhone) {
        return new Contact(contactName,contactPhone);
    }
}
