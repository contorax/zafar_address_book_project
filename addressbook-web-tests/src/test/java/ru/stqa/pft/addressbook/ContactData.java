package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String mobileNumber;
  private final String emailAddress;

  public ContactData(String FirstName, String LastName, String MobileNumber, String EmailAddress) {
    firstName = FirstName;
    lastName = LastName;
    mobileNumber = MobileNumber;
    emailAddress = EmailAddress;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }
}
