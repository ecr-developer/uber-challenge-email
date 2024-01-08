package dev.ecrodrigues.email.infrastructure.consumer;

import dev.ecrodrigues.email.application.UseCase;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(new UseCase().execute());
  }
}