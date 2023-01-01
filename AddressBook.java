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
    public static ArrayList<Contacts> contactList = new ArrayList<>();

    public void toDeleteContact() {
        //Get First Name to Delete the Contact
        System.out.println("Enter the First Name = ");
        String name = scanner.nextLine();
        for (Contacts contacts : contactList) {
            //check if the Given User with First Name
            if (contacts.firstName.equals(name)) {
                contactList.remove(contacts);
                System.out.println("Contact Deleted SuccessFully");
            }
        }
    }

    public void showContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }

    public void toEditContact() {
        /*
        to edit contact in address book
         */
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();

        if (contacts.firstName.equals(firstName)) {
            System.out.println(contacts);
            System.out.println("Enter What you want to Edit \n1]First Name\n" +
                    " 2]Last Name\n 3]e-mail\n 4]Address\n 5]Zip\n 6]Phone No-\n7]State\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter New First Name");
                    String newFirstName = scanner.nextLine();
                    contacts.lastName = newFirstName;
                    break;
                case 2:
                    System.out.println("Enter New Last Name");
                    String newLastName = scanner.nextLine();
                    contacts.lastName = newLastName;
                    break;
                case 3:
                    System.out.println("Enter New e-mail");
                    String newEmail = scanner.nextLine();
                    contacts.email = newEmail;
                    break;
                case 4:
                    System.out.println("Enter New Address");
                    String newAddress = scanner.nextLine();
                    contacts.address = newAddress;
                    break;
                case 5:
                    System.out.println("Enter New Zip Code");
                    int newZip = scanner.nextInt();
                    contacts.zip = newZip;
                    break;
                case 6:
                    System.out.println("Enter New Phone No-");
                    long newPhone = scanner.nextLong();
                    contacts.phoneNo = newPhone;
                    break;
                case 7:
                    System.out.println("Enter New State Name");
                    String newState = scanner.nextLine();
                    contacts.state = newState;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public void addNewContacts() {
        boolean result = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Creating new contacts");
        System.out.println("Enter the details of contact");
        String firstName = null;
        String lastName = null;
        while (result) {
            System.out.println("Enter First Name :");
            firstName = scan.nextLine();
            System.out.println("Enter Last Name :");
            lastName = scan.nextLine();
            result = checkIfAlreadyExists(firstName, lastName);
        }
        System.out.println("Enter Address :");
        String address = scan.nextLine();
        System.out.println("Enter city :");
        String city = scan.nextLine();
        System.out.println("Enter state :");
        String state = scan.nextLine();
        System.out.println("Enter e-mail :");
        String email = scan.nextLine();
        System.out.println("Enter phone number :");
        String phoneNo = scan.nextLine();
        contactList.add(new Contacts(firstName, lastName, address, state, email, phoneNo));
    }

    private boolean checkIfAlreadyExists(String firstName, String lastName) {
        for (Contacts contact : contactList) {
            if (contact.firstName.equals(firstName) && contact.lastName.equals(lastName)) {
                System.out.println("Contact Already exists");
                return true;
            }
        }
        return false;
    }
}



