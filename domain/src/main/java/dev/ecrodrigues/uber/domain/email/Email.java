package dev.ecrodrigues.uber.domain.email;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public class Email {

  private String id;
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
      final String id,
      final String accountId,
      final String emailFrom,
      final Set<String> emailTo,
      final String subject,
      final String content,
      final EmailSenders emailSenders,
      final boolean active,
      final Instant createdAt,
      final Instant updatedAt,
      final Instant deletedAt
  ) {
    this.id = id;
    this.accountId = accountId;
    this.emailFrom = emailFrom;
    this.emailTo = emailTo;
    this.subject = subject;
    this.content = content;
    this.emailSenders = emailSenders;
    this.active = active;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
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
        id,
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

  public String getId() {
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
