package dev.ecrodrigues.uber.domain.email;

import dev.ecrodrigues.uber.domain.Identifier;
import java.util.Objects;
import java.util.UUID;

public class EmailID extends Identifier {

  private final String value;

  public EmailID(final String value) {
    Objects.requireNonNull(value);
    this.value = value;
  }

  public static EmailID unique() {
    return EmailID.from(UUID.randomUUID());
  }

  public static EmailID from(final String anId) {
    return new EmailID(anId);
  }

  public static EmailID from(final UUID anId) {
    return new EmailID(anId.toString().toLowerCase());
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final EmailID emailID = (EmailID) o;
    return Objects.equals(getValue(), emailID.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getValue());
  }
}
