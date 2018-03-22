package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBaseContacts {

    @Test
    public void testContactCreation() {

        gotoHomePage();
        initContactCreation();
        fillContactForm( new ContactData( "Ivan", "Pavlov", "224555000", "justdoit@mail.ru" ) );
        submitContactCreation();
        returnToHomePage();
    }

}
