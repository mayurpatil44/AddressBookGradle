package addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contacts contactObj = new Contacts();

    public Contacts AddContact() {
        Contacts contactObj = new Contacts();
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Enter the first name");
                check = contactObj.setFirstName(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the last name");
                check = contactObj.setLastName(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the address");
                check = contactObj.setAddress(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the city");
                check = contactObj.setCity(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the state");
                check = contactObj.setState(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the zip code");
                check = contactObj.setZip(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the phone number");
                check = contactObj.setPhoneNo(sc.nextLine());
            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        check = false;

        while (!check) {
            try {
                System.out.println("Enter the email");
                check = contactObj.setEmail(sc.nextLine());

            } catch (AddressBookException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Contact Added");
        return contactObj;
    }

    public void EditContact(String firstName, String lastName, ArrayList<Contacts> tempList) {
        if (tempList.isEmpty()) {
            System.out.println("No contacts present");
        } else {
            boolean check = false;
            for (Contacts item : tempList) {
                if ((item.getFirstName().equals(firstName)) && (item.getLastName().equals(lastName))) {
                    System.out.println("What do you want to edit");
                    String choice = sc.nextLine().toLowerCase();
                    if (choice.equals("address")) {
                        while (!check) {
                            try {
                                System.out.println("Enter the address");
                                check = item.setAddress(sc.nextLine());
                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    } else if (choice.equals("city")) {
                        while (!check) {
                            try {
                                System.out.println("Enter the city");
                                check = item.setCity(sc.nextLine());
                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    } else if (choice.equals("state")) {
                        while (!check) {
                            try {
                                System.out.println("Enter the state");
                                check = item.setState(sc.nextLine());
                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    } else if (choice.equals("zip")) {
                        while (!check) {
                            try {
                                System.out.println("Enter the zip code");
                                check = item.setZip(sc.nextLine());
                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    } else if (choice.equals("phone number")) {

                        while (!check) {
                            try {
                                System.out.println("Enter the phone number");
                                check = item.setPhoneNo(sc.nextLine());
                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    } else if (choice.equals("email")) {
                        while (!check) {
                            try {
                                System.out.println("Enter the email");
                                check = item.setEmail(sc.nextLine());

                            } catch (AddressBookException e) {
                                System.out.println(e.getMessage());
                            }

                        }
                        break;
                    }

                }
            }
            if (check)
                System.out.println("Contact edited Successfully");
            else
                System.out.println("No Such Person present");
        }
    }

    public void DeleteContact(String firstName, String lastName, ArrayList<Contacts> tempList) {
        if (tempList.isEmpty()) {
            System.out.println("No contacts present");
        } else {

            for (Contacts item : tempList) {
                if ((item.getFirstName().equals(firstName)) && (item.getLastName().equals(lastName))) {
                    tempList.remove(item);
                    break;
                }
            }
        }

    }

    public void DisplayContacts(ArrayList<Contacts> tempList) {
        ArrayList<Contacts> contactList1 = tempList;
        if (contactList1.isEmpty()) {
            System.out.println("No contacts present");
        } else {
            int count = 0;
            for (Contacts item : contactList1) {
                count++;
                System.out.println("Contact no." + count + " \n" + item.toString());

            }
        }
    }

    public void EditContact(String firstName, String lastName) {
    }

    public void DeleteContact(String firstName, String lastName) {
    }

    public void DisplayContacts() {
    }
}