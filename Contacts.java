package Address;

import java.util.Scanner;

public class Contacts {

    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public int zip;
    public long phoneNo;
    public String email;
    public String city;

    Contacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating New Contact");
        System.out.println("Enter Details");
        System.out.println("Enter First Name-");
        this.firstName = scanner.nextLine();
        System.out.println("Enter Last Name");
        this.lastName = scanner.nextLine();
        System.out.println("Enter Your Address-");
        this.address = scanner.nextLine();
        System.out.println("Enter State-");
        this.state = scanner.nextLine();
        System.out.println("Enter Zip Code-");
        this.zip = scanner.nextInt();
        System.out.println("Enter Phone Number-");
        this.phoneNo = scanner.nextLong();
        System.out.println("Enter e-m@il-");
        this.email = scanner.nextLine();
        System.out.println("Enter City");
        this.city = scanner.nextLine();

    }

    public Contacts(String firstName, String lastName, String address, String state, int zip, long phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public Contacts(String firstName, String lastName, String address,String city, String state, String email, String phoneNo) {

    }


    @Override
    public String toString() {
        return "Contacts{" +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\naddress='" + address + '\'' +
                "\ncity='" + zip + '\'' +
                "\nstate='" + state + '\'' +
                "\nemail='" + email + '\'' +
                "\ncity='" + city + '\'' +
                "\nphoneNo='" + phoneNo + '\'' +
                '}';

    }
}