package dev.ecrodrigues.email.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

  @Test
  public void testNewEmail() {
    Assertions.assertNotNull(new Email());
  }

}
