package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super( wd );
  }

  public void returnToGroupPage() {
    click( By.linkText( "group page" ) );
  }

  public void submitGroupCreation() {
    click( By.name( "submit" ) );
  }

  public void fillGroupForm(GroupData groupData) {
    type( By.name( "group_name" ), groupData.getName() );
    type( By.name( "group_header" ), groupData.getHeader() );
    type( By.name( "group_footer" ), groupData.getFooter() );
  }

  public void initGroupCreation() {
    click( By.name( "new" ) );
  }

  public void deleteSelectedGroups() {
    click( By.name( "delete" ) );
  }

  public void selectGroup(int index) {
    wd.findElements( By.name( "selected[]" ) ).get( index ).click();
  }

  public void initGroupModification() {
    click( By.name( "edit" ) );
  }

  public void submitGroupModification() {
    click( By.name( "update" ) );
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm( group );
    submitGroupCreation();
    returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent( By.cssSelector( " span.group" ) );
  }


  public int getGroupCount() {
    return wd.findElements( By.name( "selected[]" ) ).size();
  }

  public List <GroupData> getGroupList() {
    // создаем список который будем заполнять
    List <GroupData> groups = new ArrayList <GroupData>();
    // чтобы заполнить этот список какими-то объектами, данные для создания этих объектов будут извлекаться  со страницы веб приложения
    // и таким образом получаем список объектов типа WebElement
    List <WebElement> elements = wd.findElements( By.cssSelector( "span.group" ) );
    // и теперь нужно по этим элементами пройти в цикле, и по каждому из нихвыполнить какие-то действия
    // переменная element пробегает по списку elements
    for (WebElement element : elements) {
      // из каждого такого element  мы получаем Text - это будет имя группы
      String name = element.getText();
      String id = element.findElement( By.tagName( "input" ) ).getAttribute( "value" ); // ищем один элемент вниутри другого = это и есть идентификатор который мы искали
      // создаем объект типа GroupData
      GroupData group = new GroupData( id, name, null, null );
      // добавляем в созданный объект список
      groups.add( group );
    }
    // в конце этот список должен возвращаться
    return groups;
  }
}
