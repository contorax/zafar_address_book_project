package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBaseContacts {


  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }


  @AfterMethod
  public void tearDown() {
    app.stop();
  }


  public ApplicationManager getApp() {
    return app;
  }
}