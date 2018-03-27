package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(WebDriver wd) {
    super(wd);     }

  public void returnToHomePage() {
    clickcontact( By.id("content") );
  }

  public void submitContactCreation() { clickcontact( By.xpath( "//div[@id='content']/form/input[21]" ) );  }

  public void fillContactForm(ContactData contactData) {
    typecontact( By.name( "firstname" ), contactData.getFirstname() );
    typecontact( By.name("lastname"), contactData.getLastname() );
    typecontact( By.name("mobile"), contactData.getMobilenumber() );
    typecontact( By.name("email"), contactData.getEmail() );
  }

  public void initContactCreation() {
    clickcontact( By.linkText("add new") );
  }

  public void gotoHomePage() {
    clickcontact( By.linkText("home") );
  }

  public void deleteSelectedContacts() {
    clickcontact( By.xpath( "//div[@id='content']/form[2]/div[2]/input" ) );
  }

  public void closeAlertWindow (){
  wd.switchTo().alert().accept();}

  public void selectContact() {
    clickcontact( By.name( "selected[]" ) );
  }

  public void initContactModification() {
    clickcontact( By.xpath (" //table[@id='maintable']/tbody/tr[2]/td[8]/a/img "));
  }

  public void submitContactModification() {
    clickcontact( By.xpath (" //div[@id='content']/form[1]/input[22] "));
  }
}
