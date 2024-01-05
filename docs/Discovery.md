# Discovery

In the challenge of coding with a focus on the back-end, there are a few points to pay attention to:

1. The solution must be working with two email providers;
2. Provide a JSON in/out RESTful API;
3. Provide minimal documentation on how to use the API;

##  Table of Contents

* [Uber Challenge Email](../README.md#table-of-contents)
    * [Comments](../README.md#comments)
    * [Guides](../README.md#guides)
    * [Announcements](../README.md#announcements)
    * [License](../README.md#license)
* Discovery
    * [Emails Provider](#emails-provider)
    * [Business Rules](#business-rules)
* [Architecture](./Architecture.md)

## Emails Provider

- [Amazon SES](https://aws.amazon.com/ses/getting-started/) ->
As part of AWS Free Tier, SES offers a flexible free tier which enables you to try the SES. Free tier customers receive up to 3,000 message charges free each month for the first 12 months after you start using SES.
- [Twilio SendGrid](https://docs.sendgrid.com/ui/account-and-settings/billing#free) -> There is a limit 100 email/day;

## Business Rules

- The service must offer the option of choosing the e-mail provider to be used;
- The e-mail to be sent must not be null or empty and must have a valid structure;
- If you do not specify the provider to be used, the Amazon SES service should be used by default;
- If the Amazon SES service is not working or gives an error, you should use the SendGrid provider;
- If the SendGrid service is not working or gives an error, you should use the Amazon SES provider;
- The service must contain templates with multi-languages;