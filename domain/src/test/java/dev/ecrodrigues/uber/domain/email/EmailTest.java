package dev.ecrodrigues.uber.domain.email;

import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {
  @Test
  public void givenAValidParams_whenCallNewEmail_thenInstantiateAnEmail() {
    final var expectedAccountId = UUID.randomUUID().toString();
    final var expectedEmailFrom = "no-replay-test@test.com";
    final var expectedEmailTo = Set.of("test1@example.com");
    final var expectedSubject = "Email Test";
    final var expectedContent = "Email Content";
    final var expectedIsActive = true;
    final var expectedEmailSender = EmailSenders.AWS_SES;

    final var actualEmail =
        Email.newEmail(expectedAccountId, expectedEmailFrom, expectedEmailTo, expectedSubject, expectedContent, expectedIsActive);

    Assertions.assertNotNull(actualEmail);
    Assertions.assertNotNull(actualEmail.getId());
    Assertions.assertEquals(expectedAccountId, actualEmail.getAccountId());
    Assertions.assertEquals(expectedEmailFrom, actualEmail.getEmailFrom());
    Assertions.assertEquals(expectedEmailTo, actualEmail.getEmailTo());
    Assertions.assertEquals(expectedContent, actualEmail.getContent());
    Assertions.assertEquals(expectedIsActive, actualEmail.isActive());
    Assertions.assertEquals(expectedEmailSender, actualEmail.getEmailSenders());
    Assertions.assertNotNull(actualEmail.getCreatedAt());
    Assertions.assertNotNull(actualEmail.getUpdatedAt());
    Assertions.assertNull(actualEmail.getDeletedAt());
  }
}