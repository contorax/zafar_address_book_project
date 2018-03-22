package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBaseContacts {




  @Test
  public void testContactDeletion() {
    gotoHomePage();
    selectContact();
    deleteSelectedContacts();


  }


}
