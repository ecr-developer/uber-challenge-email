package dev.ecrodrigues.uber.domain.email;

import dev.ecrodrigues.uber.domain.AggregateRoot;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public class Email extends AggregateRoot<EmailID> {

  private String accountId;
  private String emailFrom;
  private Set<String> emailTo;
  private String subject;
  private String content;
  private EmailSenders emailSenders;
  private boolean active;
  private Instant createdAt;
  private Instant updatedAt;
  private Instant deletedAt;

  private Email(
      final EmailID anId,
      final String anAccountId,
      final String anEmailFrom,
      final Set<String> anEmailTo,
      final String aSubject,
      final String aContent,
      final EmailSenders anEmailSenders,
      final boolean isActive,
      final Instant aCreatedAt,
      final Instant anUpdatedAt,
      final Instant aDeletedAt
  ) {
    super(anId);
    this.accountId = anAccountId;
    this.emailFrom = anEmailFrom;
    this.emailTo = anEmailTo;
    this.subject = aSubject;
    this.content = aContent;
    this.emailSenders = anEmailSenders;
    this.active = isActive;
    this.createdAt = aCreatedAt;
    this.updatedAt = anUpdatedAt;
    this.deletedAt = aDeletedAt;
  }

  public static Email newEmail(
      final String anAccountId,
      final String anEmailFrom,
      final Set<String> anEmailTo,
      final String aSubject,
      final String aContent,
      final boolean isActive
  ) {
    final var id = UUID.randomUUID().toString();
    final var now = Instant.now();
    final var deletedAt = isActive ? null : now;
    return new Email(
        EmailID.unique(),
        anAccountId,
        anEmailFrom,
        anEmailTo,
        aSubject,
        aContent,
        EmailSenders.AWS_SES,
        isActive,
        now,
        now,
        deletedAt
    );
  }

  public EmailID getId() {
    return id;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getEmailFrom() {
    return emailFrom;
  }

  public Set<String> getEmailTo() {
    return emailTo;
  }

  public String getSubject() {
    return subject;
  }

  public String getContent() {
    return content;
  }

  public EmailSenders getEmailSenders() {
    return emailSenders;
  }

  public boolean isActive() {
    return active;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }
}
