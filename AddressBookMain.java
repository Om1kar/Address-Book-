package Address;

import java.util.*;

public class AddressBookMain {
    private static List<AddressBook> addressBookList = new ArrayList<>();

    private static Map<String, AddressBook> map = new HashMap<String, AddressBook>();

    private static AddressBook addressBook;

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        int option = 0;
        /*
        Object of class Address Book
         */
        AddressBook addressBook = new AddressBook();
        System.out.println("Choose Options = ");
        System.out.println("1]To Add New Contact " + " 2]To show Contact "
                + " 3]To Edit Contact " + " 4]To Delete Contact");
        /*
         scanner object used to take option input from user
         */
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        while (option != 5) {
            System.out.println("1.Create new Address book \n2.Remove Address book"
                    + "\n3.Print all Address book \n4. Select Address book \n5. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    removeAddressBook();
                    break;
                case 3:
                    showAddressBook();
                    break;
                case 4:
                    selectAddressBook();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }

    private static void selectAddressBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of address book to be selected");
        String name = scanner.nextLine();
        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            if (m.getKey().equals(name)) {
                addressBook = m.getValue();
                int option = 0;
                while (option != 5) {
                    System.out.println("1.Add Contact \n2.Remove Contact"
                            + " \n3.Edit Contact \n4.Print all Contact \n5. Back to main menu");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            addressBook.addNewContacts();
                            break;
                        case 2:
                            addressBook.toDeleteContact();
                            break;
                        case 3:
                            addressBook.toEditContact();
                            break;
                        case 4:
                            addressBook.showContacts();
                            break;
                        case 5:
                            System.out.println("Back to main menu");
                            break;
                        default:
                            System.out.println("Invalid Selection ");
                    }
                }

            }
        }
    }

    private static void showAddressBook() {

        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            System.out.println(m.getKey());
        }
    }

    private static void removeAddressBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Address Book to be removed");
        String name = scanner.nextLine();
        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            if (m.getKey().equals(name)) {
                map.remove(name);
            }
        }
    }

    public static void addNewAddressBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Address Book");
        String name = scanner.nextLine();
        AddressBook addressBook = new AddressBook();
        addressBookList.add(addressBook);
        map.put(name, addressBook);
    }

}