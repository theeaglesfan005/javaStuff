package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        return findContact(contact) != -1 ? false : myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        return findContact(oldContact) != -1 ? myContacts.remove(oldContact) && myContacts.add(newContact) : false;
    }

    public boolean removeContact(Contact contact) {
        return findContact(contact) == -1 ? false : myContacts.remove(contact);
    }

    private int findContact(Contact queryContact) {
        return findContact(queryContact.getName());
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

}
