package addressbook;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FileIOAddressBookTest {
    @Test
    public void givenContactsInFileShouldRead() {
        FileIOServiceAddressBook fileIOServiceAddressBook = new FileIOServiceAddressBook();
        List<Contacts> contactList = new ArrayList<>();
        contactList = fileIOServiceAddressBook.readData();
        System.out.println(contactList);
        Assert.assertEquals(2, contactList.size());
    }

    @Test
    public void writeContactsToFile() {
        FileIOServiceAddressBook fileIOServiceAddressBook = new FileIOServiceAddressBook();
        List<Contacts> contactList = new ArrayList<>();
        Contacts contact1 = new Contacts("Mayur", "Patil", "MH", "Dhule", "MH", "123456", "91 7620107982",
                "mayurpatil44@hotmail.com");
        Contacts contact2 = new Contacts("Wolverine", "Logan", "pune", "pune", "mh", "452136", "91 4785236998",
                "abcd@gmail.com");
        contactList.add(contact1);
        contactList.add(contact2);
        fileIOServiceAddressBook.writeData(contactList);
        Assert.assertEquals(16, fileIOServiceAddressBook.countEntries());
    }
}