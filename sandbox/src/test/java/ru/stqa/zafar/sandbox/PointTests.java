package ru.stqa.zafar.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
@Test
  public void TestDistance () {

    Distance d = new Distance ();
    d.p1 = 8;
    d.p2 = 2;
  Assert.assertEquals(d.distance(), 6.0);
  }
}

