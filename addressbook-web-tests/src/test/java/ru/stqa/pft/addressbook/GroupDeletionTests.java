package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        if (!app.wd.findElement(By.name("selected[]")).isSelected()) {
            app.selectGroup();
        }
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}