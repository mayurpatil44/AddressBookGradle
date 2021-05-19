package addressbook;

public class Contacts {

    String firstName, lastName, name, address, city, state, zip, phoneNo, email;

    Validation validateContact = new Validation();

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) throws AddressBookException {
        boolean b = validateContact.ValidateFirstName(firstName);
        if (b) {
            this.firstName = firstName;

        } else {
            throw new AddressBookException("Please enter a valid first name");

        }
        return b;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean setLastName(String lastName) throws AddressBookException {
        boolean b = validateContact.ValidateLastName(lastName);
        if (b)
            this.lastName = lastName;

        else {
            throw new AddressBookException("Please enter a valid last name");

        }
        return b;
    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) throws AddressBookException {
        boolean b = validateContact.ValidateAddress(address);
        if (b)
            this.address = address;

        else {
            throw new AddressBookException("Please enter a valid address");

        }
        return b;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) throws AddressBookException {
        boolean b = validateContact.ValidateCity(city);
        if (b)
            this.city = city;

        else {
            throw new AddressBookException("Please enter a valid city");

        }
        return b;
    }

    public String getState() {
        return state;
    }

    public boolean setState(String state) throws AddressBookException {
        boolean b = validateContact.ValidateState(state);
        if (b)
            this.state = state;

        else {
            throw new AddressBookException("Please enter a valid state");

        }
        return b;
    }

    public String getZip() {
        return zip;
    }

    public boolean setZip(String zip) throws AddressBookException {
        boolean b = validateContact.ValidateZip(zip);
        if (b)
            this.zip = zip;

        else {
            throw new AddressBookException("Please enter a valid zip");

        }
        return b;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public boolean setPhoneNo(String phoneNo) throws AddressBookException {
        boolean b = validateContact.ValidatePhoneNo(phoneNo);
        if (b)
            this.phoneNo = phoneNo;

        else {
            throw new AddressBookException("Please enter a valid Phone number");

        }
        return b;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) throws AddressBookException {
        boolean b = validateContact.ValidateEmail(email);
        if (b)
            this.email = email;

        else {
            throw new AddressBookException("Please enter a valid email");

        }
        return b;
    }

    @Override
    public String toString() {
        return "First Name :" + firstName + "\nLast Name :" + lastName + "\nAddress :" + address + "\nCity :" + city
                + "\nState :" + state + "\nZip :" + zip + "\nPhone No :" + phoneNo + "\nEmail :" + email;
    }
}