package ru.stqa.zafar.sandbox;

public class Point {

  public static void main(String[] args) {


    double x1 = 2;
    double y1 = 8;
    double x2 = 0;
    double y2 = 0;
    double p1 = (x2 - y1) * (x2 - x1);
    double p2 = (y2 - y1) * (y2 - y1);

    System.out.println(" расстояния между точками " + p1 + " и " + p2 + " = " + distance(p1, p2));
  }
  public static double distance(double p1, double p2) {

      return Math.sqrt(p1 + p2);

  }


}






