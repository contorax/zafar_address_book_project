package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBaseContacts;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBaseContacts {

  @Test
  public void testContactModification() {

    app.getContactHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm( new ContactData( "Adam", "Smith", "7654321", "justtest@mail.ru" ) );
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }


}
