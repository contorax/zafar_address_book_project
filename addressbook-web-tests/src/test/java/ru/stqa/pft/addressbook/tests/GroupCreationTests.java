package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
       // тут сравниваем размеры списков, которые получены с при помощи getGroupList (а следующем модуле будет сравнение списков целиком)
        List<GroupData> before = app.getGroupHelper().getGroupList();
       GroupData group = new GroupData("test1", null, null);
        app.getGroupHelper().createGroup( group );
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+1 );



        // 4.8 устраиваем цикл по всем элементам
      int max =0;
      for (GroupData g: after){
        if (g.getId()> max){
          max = g.getId();
        }
      }
      group.setId(max);
      before.add (group);
        // (4.8) среди всех элементов входящих в новый списко нужно найти тот который имеет максимальный идентификатор

      // (4.8) чтобы сравнить два списка before & after без учета порядка, надо 2 списка преоброзовать в множество (HashSet<Object>) и сравнивать их в таком виде
      Assert.assertEquals( new HashSet<Object>( before ), new HashSet <Object>( after ) );
    }

}
