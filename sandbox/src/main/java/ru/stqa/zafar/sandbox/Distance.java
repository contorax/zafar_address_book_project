package ru.stqa.zafar.sandbox;

public class Distance {


  public static void main(String[] args) {

    Point p1 = new Point(0.0 ,3.0);
    Point p2 = new Point(8.0 ,9.0);


    System.out.println( "Точка p1: x = " + p1.x + ", y = " + p1.y );
    System.out.println( "Точка p2: x = " + p2.x + ", y = " + p2.y );
    System.out.println( "Расстояние между точками p1 и p2 = " + p1.distance(p2) ) ;

  }

  }





