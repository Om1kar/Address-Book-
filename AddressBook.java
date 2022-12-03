package Address;

import java.util.Scanner;

/*   UC2-> To add new contact to Address Book
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
        System.out.println("Contact Created");

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
}
