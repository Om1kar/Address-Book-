package Address;

import java.util.ArrayList;
import java.util.Scanner;

/*
UC4-> To Delete contact
 */
public class AddressBook {
    /*
    TO take Input from User
     */
    Scanner scanner = new Scanner(System.in);
    /*
    Object of addNewContacts Class
     */
    Contacts contacts = new Contacts();
    ArrayList<Contacts> list = new ArrayList<>();

    public void addNewContacts() {
         /*
          method to add new contacts
         */
        Contacts contacts = new Contacts();
        System.out.println("Enter Contact Details");
        System.out.println("Enter First Name");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter Last Name");
        contacts.setLastName(scanner.next());
        System.out.println("Enter Email");
        contacts.setAddress(scanner.next());
        System.out.println("Enter Phone No.");
        contacts.setPhoneNo(scanner.nextLong());
        System.out.println("Enter Zip Code");
        contacts.setZip(scanner.nextInt());
        System.out.println("Enter State Name");
        contacts.setState(scanner.next());
        System.out.println("--------------------------------------------");
        list.add(contacts);
    }

    public void ShowContacts() {
        System.out.println("First Name-" + contacts.getFirstName());
        System.out.println("Last Name-" + contacts.getLastName());
        System.out.println("Email-" + contacts.getEmail());
        System.out.println("Phone No.-" + contacts.getPhoneNo());
        System.out.println("Zip Code-" + contacts.getZip());
        System.out.println("State-" + contacts.getState());
        System.out.println("------------------------------------------------");
    }

    public void toEditContact() {
        /*
        to edit contact in address book
         */
        System.out.println("Enter First Name");
        String firstName = scanner.next();

        if (!firstName.equals(contacts.getFirstName())) {
            System.out.println("Entered Name is Not in Address Book");
            System.out.println("Enter First Name-");
            scanner.next();
            System.out.println("Enter Last Name");
            scanner.next();
            System.out.println("Enter E-mail-");
            scanner.next();
            System.out.println("Enter Phone No-");
            scanner.nextLong();
            System.out.println("Zip Code-");
            scanner.nextInt();
            System.out.println("Enter State Name-");
            scanner.next();
            System.out.println("--------------------------------------------------------");
            list.add(contacts);
        } else {
            System.out.println("Contact Not found");
        }
    }

    public void toDeleteContact() {
        //Get First Name to Delete the Contact
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();

        //check if the Given User with First Name
        if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
            list.remove(contacts);
            System.out.println("Contact Deleted SuccessFully");
        } else {
            System.out.println("Contact Not Found");
        }
    }
}
