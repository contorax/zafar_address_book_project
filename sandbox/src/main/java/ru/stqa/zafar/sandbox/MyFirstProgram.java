package ru.stqa.zafar.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    String somebody = "Zafar";
    System.out.println("Hello, " + somebody + "!");

    double l = 8.0;
    double s = l * l;

    Distance d = new Distance (0, 0, 2, 0, 8, 0);

    d.p1 = (d.x2 - d.y1) * (d.x2 - d.x1);
    d.p2 = (d.y2 - d.y1) * (d.y2 - d.y1);

    System.out.println(" расстояния между точками " + d.p1 + " и " + d.p2 + " = " + distance(d));


    System.out.println("Площадь квадрата со стороной " + l + " = " + s);


  }

  public static double distance(Distance d) {

    return Math.sqrt(d.p1 + d.p2);

  }
}
