package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
       app.getNavigationHelper().gotoGroupPage();
                if (! app.getGroupHelper().isThereAGroup ()){
            app.getGroupHelper().createGroup (new GroupData("test1", null, null));
        }

        // метод возвращающий список групп и тут  сравниваем размеры списков
      List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
      List<GroupData> after = app.getGroupHelper().getGroupList();
      Assert.assertEquals(after.size(), before.size()-1 );

      // 4.6 Сравнение списков целиком, чтобы проверить что удалилась нужная группа
      // проверяется даже то, что другие группы не удалились и сохранили свои старые имена

      // перед тем как сравнивать сами списки, надо лишний элемент удалить, который мы удаляли в тестируемом приложении
      before.remove( before.size() -1 );
      // то есть получается два одинаковых списка, переменная before ссылается на список в котором удален не нужный элемент
    // и старый список должен содержать теже элементы,что и новый

    Assert.assertEquals (before, after);
    }

}