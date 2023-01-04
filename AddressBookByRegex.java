package Address;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookByRegex {
   public String validFirstName() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter First Name");
       String firstName = scanner.nextLine();
       String regex = "^[A-Z]+[a-z]{4}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(firstName);
       boolean result = matcher.matches();
       if (result) {
           System.out.println(firstName + "\nName is Valid");
       } else {
           System.out.println(firstName + " Invalid Name");
       }
       return firstName;
   }

    public String validLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        String regex = "^[A-Z]+[a-z]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(lastName + "\nLast Name is Valid");
        } else {
            System.out.println(lastName + " Invalid Name");

        }
        return lastName;
    }

    public String validEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter E-mail");
        String email = scanner.nextLine();
        /*
        pattern of e-mail string => abc.xyz@bl.co.in
         */
        String regex = "^[a-z]{3}.[a-z]{3}@[a-z]{2}.[a-z]{2}.[a-z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(email + "\nE-mail is Valid");
        } else {
            System.out.println(email + " Invalid E-mail ");

        }
        return email;
    }

    public String validContactNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact No-");
        String contactNo = scanner.nextLine();
        String regex = "^[0-9]{2} [0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contactNo);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(contactNo + "\nContact No.is Valid");
        } else {
            System.out.println(contactNo + "\nInvalid Contact No.");

        }
        return contactNo;
    }
    public String validAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        String regex = "^[A-Z]+[a-z]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(address + "\nAddress is Valid");
        } else {
            System.out.println(address + " Invalid");

        }
        return address;
    }
    public String validZip(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter zip code");
        String zip = scanner.nextLine();
        String regex = "^[0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zip);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(zip + "\nValid zip code");
        } else {
            System.out.println(zip + "\nInvalid");

        }
        return zip;
    }
    public String validCity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city ");
        String city = scanner.nextLine();
        String regex = "^[A-Z]+[a-z]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(city);
        boolean result = matcher.matches();
        if (result) {
            System.out.println(city + "\nCity Name is Valid");
        } else {
            System.out.println(city + " Invalid Name");
        }
        return city;
    }
}
