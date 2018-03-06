package ru.stqa.zafar.sandbox;

public class Point {

  public static void main(String[] args) {


    double  p1 = 8;
    double p2 = 2;
    System.out.println(" расстояния между точками " + p1+ " и " +  p2+ " = " + distance( p1,  p2));

  }

  public static double distance( double p1, double p2) {
    return  p1 -  p2;
  }




}
