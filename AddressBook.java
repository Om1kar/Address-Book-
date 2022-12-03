package Address;

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
    public void addNewContacts() {
         /*
          method to add new contacts
         */
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
        } else {
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
        }
    }
    public void toDeleteContact(){
        //Get First Name to Delete the Contact
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();

        //check if the Given User with First Name
        if(!firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else {
            contacts.setFirstName(null);
            contacts.setLastName(null);
            contacts.setAddress(null);
            contacts.setState(null);
            contacts.setZip(0);
            contacts.setPhoneNo(0);
            contacts.setEmail(null);
        }
    }
}
