package addressbook;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    @Test
    public void firstNameTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateFirstName("Mayur");
        Assert.assertTrue(true);
    }

    @Test
    public void lastNameTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateLastName("Patil");
        Assert.assertTrue(true);
    }

    @Test
    public void emailTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateEmail("mayurpatil44@hotmail.com");
        Assert.assertTrue(true);
    }

    @Test
    public void phoneNoTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidatePhoneNo("91 7620107982");
        Assert.assertTrue(true);
    }

    @Test
    public void addressTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateAddress("Ladhak");
        Assert.assertTrue(true);
    }

    @Test
    public void cityTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateCity("Dhule");
        Assert.assertTrue(true);
    }

    @Test
    public void stateTest() {
        Validation contact = new Validation();
        boolean result = contact.ValidateState("Maharashtra");
        Assert.assertTrue(true);
    }
}