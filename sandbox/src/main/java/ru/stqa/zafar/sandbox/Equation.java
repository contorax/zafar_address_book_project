package ru.stqa.zafar.sandbox;

public class Equation {
  private double a;
  private double b;
  private double c;

  private int n;
  public Equation (double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

    if (a != 0) {

      // конструкция типа свертка (три равноправных взаимоисключающих события, то есть дискримант либо
      // равен 0, либо больше 0, либо меньше 0)
      if (d > 0) {
        n = 2;
      } else if (d == 0) {
        n = 1;
      } else {
        n = 0;
      }


      // конструкция типа свертка, (но они как бы вложены, но написаны в свернутой форме)   ( каскад проверок)
    } else if (b != 0) {
      n = 1;

    } else if (c != 0) {
      n = 0;

    } else {
      n = -1;
    }


  }
    public int rootNumber ()
    {return n;}
  }

