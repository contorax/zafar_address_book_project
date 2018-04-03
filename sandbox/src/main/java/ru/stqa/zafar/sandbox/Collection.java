package ru.stqa.zafar.sandbox;

import org.testng.internal.junit.ArrayAsserts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {

  public static void main (String [] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};


    List <String> languages = Arrays.asList("Java", "C#", "Python", "PHP") ;
    //List <String> languages = new ArrayList <String>();
    //languages.add( "Java" );
    //languages.add( "C#" );
    //languages.add( "Python" );
    //languages.add( "PHP" );


    for (String l : languages) {
      {

        System.out.println( "I want to learn " + l );
      }
    }

  }}

  //for (String l: langs){
          // или так
          // for (int i = 0; i < langs.length; i++){

         // System.out.println( "I want to learn " + l ); }
          //}