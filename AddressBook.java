package Address;

import java.util.Scanner;

/*   UC1-> To create contacts in Address Book
 */
public class AddressBook {
    /*
    TO take Input from User
     */
    Scanner scanner = new Scanner(System.in);
    /*
    Object created of Contacts Class
     */
    Contacts contacts = new Contacts();

    public void Contacts() {
        System.out.println("Enter First Name");
        contacts.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name");
        contacts.setLastName(scanner.nextLine());
        System.out.println("Enter Email");
        contacts.setAddress(scanner.nextLine());
        System.out.println("Enter Phone No.");
        contacts.setPhoneNo(scanner.nextLong());
        System.out.println("Enter Zip Code");
        contacts.setZip(scanner.nextInt());
        System.out.println("Enter State Name");
        contacts.setState(scanner.nextLine());
        System.out.println("Contacts Created");

    }

    public void ShowContacts() {
        System.out.println("Enter First Name" + contacts.getFirstName());
        System.out.println("Enter Last Name" + contacts.getLastName());
        System.out.println("Enter m@il" + contacts.getEmail());
        System.out.println("Enter Phone No." + contacts.getPhoneNo());
        System.out.println("Enter Zio Code" + contacts.getZip());
        System.out.println("Enter State Name" + contacts.getState());

    }
}
