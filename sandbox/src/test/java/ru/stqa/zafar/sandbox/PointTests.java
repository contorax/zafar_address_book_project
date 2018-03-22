package ru.stqa.zafar.sandbox;

        import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void TestDistance () {

    Distance d = new Distance();
    Point p1 = new Point( 0.0, 3.0 );
    Point p2 = new Point( 8.0, 9.0 );
    assert p1.distance( p2 ) == 9;  }
}