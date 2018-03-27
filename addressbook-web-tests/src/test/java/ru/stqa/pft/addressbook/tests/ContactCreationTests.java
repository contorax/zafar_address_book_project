package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm( new ContactData( "Ivan", "Pavlov", "224555000", "justdoit@mail.ru" ) );
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
