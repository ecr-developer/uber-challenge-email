package dev.ecrodrigues.email.application;

import dev.ecrodrigues.email.domain.Email;

public class UseCase {

  public Email execute() {
    return new Email();
  }
}
