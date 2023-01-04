package Address;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts;
    Map<String, List> map = new HashMap<>();
    ArrayList<Contacts> list = new ArrayList<>();

    public void addNewAddressBook() {
        System.out.println("Enter AddressBook Name :");
        String addressBook = scanner.next();
        if (map.keySet().equals(addressBook)) {
            System.out.println("Entered AddressBook is already Exist");
        } else {
            map.put(addressBook, list);
        }
    }

    public void showAddressBook() {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public void checkContact() {
        System.out.println("Enter AddressBook Name :");
        String addName = scanner.next();
        for (String key : map.keySet()) {
            if (!addName.equalsIgnoreCase(key)) {
                System.out.println("Address Book Not Found-----!!!");
            } else {
                System.out.println("Match Found-----!!");
                System.out.println("Enter First Name :");
                String firstName = scanner.next();
                try {
                    if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
                        addNewContact();
                    } else {
                        System.out.println("Contact Already Exist");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Contact Not Found------!!, Please Add First");
                    addNewContact();

                }
            }
        }
    }

    public void addNewContact() {
        contacts = new Contacts();
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(scanner.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the City :");
        contacts.setCity(scanner.next());
        System.out.println("Enter the State :");
        contacts.setState(scanner.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(scanner.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(scanner.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(scanner.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
    }

    public void displayContact() {
        try {
            if (contacts.getFirstName() == null) {
                System.out.println("Contact Not Found");
            } else {
                for (Contacts cont : list) {
                    System.out.println(cont);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Contact Not Found----!!");
        }
    }

    public void editContact() {
        contacts = new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstName(scanner.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastName(scanner.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(scanner.next());
            System.out.println("Enter the City :");
            contacts.setCity(scanner.next());
            System.out.println("Enter the State :");
            contacts.setState(scanner.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(scanner.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(scanner.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(scanner.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }

    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        try {
            if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
                list.remove(contacts);
                System.out.println("Contact Deleted Successfully-------!!!");
            } else {
                System.out.println("Not Found");
            }
        } catch (NullPointerException e) {
            System.out.println("Contact Not Found---!!");
        }
    }

    public void searchByCity() {
        System.out.println("Enter city Name:");
        String city = scanner.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }

    public void searchByState() {
        System.out.println("Enter State Name:");
        String state = scanner.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
    }

    public void countByCity() {
        System.out.println("Enter the city Name:");
        String city = scanner.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).count();
        System.out.println("Total number of Persons in city " + city + ":" + count);
    }

    public void countByState() {
        System.out.println("Enter the State Name:");
        String state = scanner.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getState().equalsIgnoreCase(state)).count();
        System.out.println("Total number of Persons in city " + state + ":" + count);
    }

    public void sortedList() {
        List<Contacts> sortedlist = list.stream().sorted(Comparator.comparing(contacts -> contacts.getFirstName())).collect(Collectors.toList());
        for (Contacts details : sortedlist) {
            System.out.println(details.toString());
        }

    }
    public static void createFile() {
        try {
            File myFile = new File("C:\\Users\\hp\\IdeaProjects\\RFP229\\src\\Address\\myfile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File Exists");
            }
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
    public static void toReadFile(){
        try {
            File myFile = new File("C:\\Users\\hp\\IdeaProjects\\RFP229\\src\\Address\\myfile.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
    }



