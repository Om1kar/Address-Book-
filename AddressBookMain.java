package Address;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        int choice;
        /*
        Object of class Address Book
         */
        AddressBook addressBook = new AddressBook();
        /*
         Non-static Method to add contacts
         */
        addressBook.addNewContacts();
        System.out.println("Choose Options = ");
        System.out.println("1]To Add New Contact " + " 2]To show Contact");
        /*
         scanner object used to take choice input from user
         */
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addressBook.addNewContacts();
                System.out.println("New Contact Added");
                break;
            case 2:
                addressBook.ShowContacts();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
