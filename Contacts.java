package Address;

public class Contacts {
    private String firstName;
    private String lastName;
    private String Address;
    private String city;
    private String state;
    private String Pin;
    private String phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts Details :--" +"\n"+
                "Firstname : " + firstName +"\n"+
                "Lastname : " + lastName + '\n'+
                "Address : " + Address + '\n' +
                "City : " + city + '\n' +
                "State : " + state + '\n' +
                "Pin : " + Pin +'\n'+
                "PhoneNumber : " + phoneNumber +'\n'+
                "Email : " + email +'\n';
    }
}