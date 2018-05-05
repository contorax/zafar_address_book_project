package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    // тут сравниваем размеры списков, которые получены с при помощи getGroupList (а следующем модуле будет сравнение списков целиком)
    List <GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData( "test2", null, null );
    app.getGroupHelper().createGroup( group );
    List <GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals( after.size(), before.size() + 1 );


    // Лекция 4.9. Список можно превратить в поток.  у этого поток есть метод мах для вычисл макс элемента
    // переменую нужно инитилизировать - присвоить ей значение
// Comparator это интерфейс который не имеет реализации, он только декларирует-объявляет какие методы должжны быть, но реализацией этих методов не содержит

    // 4.9. локальную переменную удаляем  int max1 = after.stream().max( (o1, o2) -> Integer.compare(o1.getId(), o2.getId()  ) ).get().getId();

    group.setId( after.stream().max( (o1, o2) -> Integer.compare( o1.getId(), o2.getId() ) ).get().getId() );
    before.add( group );
    // (4.8) среди всех элементов входящих в новый списко нужно найти тот который имеет максимальный идентификатор

    // (4.8) чтобы сравнить два списка before & after без учета порядка, надо 2 списка преоброзовать в множество (HashSet<Object>) и сравнивать их в таком виде
    Assert.assertEquals( new HashSet <Object>( before ), new HashSet <Object>( after ) );
  }

}
