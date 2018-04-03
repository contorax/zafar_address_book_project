package ru.stqa.zafar.sandbox;

public class Primes {

  public static boolean isPrime (int n) {
    for (int i = 2; i < n; i++){
      if (n % i == 0) {
        return false;
      }
    }
    return true;

  }

  public static boolean isPrimeWhile (int n) {
    int i = 2;
    while (i < n){
      if (n % i == 0) {
        return false;
    }
    i++;
    }
    return true;

  }


// в случае с while можно избавиться от конструкции if  и эту проверку включить в условие окончания цикла
// while (i < n && n % i != 0) то есть проверка продолжается до тех пор пока i < n  и остаток от деления i на n не равно 0 то есть  n на i
 // не делится, тогда продолжаем искать делитель дальше

  public static boolean isPrimeWhile2 (int n) {
    int i = 2;
    while (i < n && n % i != 0){
           i++;
    }
    return i == n;

  }
}