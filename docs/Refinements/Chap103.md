# [CHAP-103] Creating the Email entity with TDD

The e-mail domain class will be created, with the following properties:

## **Email Domain:**

* AccountId - As this microservice is part of something bigger, I'll create this property because we can have an account associated with several emails;
* EmailFrom
* EmailTo
* Subject
* Content
* EmailSender - Information about who sent the e-mail
* Audit (Create date, update and delete)

### **Business Rules:**

* AccountId must not be null or empty;
* EmailFrom must not be null or empty;
* EmailFrom must be valid;
* EmailTo must not be null or empty;
* EmailTo must be valid;
* EmailTo can have one or more emails;
* Content can be null or empty;

### **Tech Refinement:**

Add commons-validator as a dependency to check if the email is valid.

Lirary: Apache Commons Validator
License: Apache 2.0
Version: 1.8.0
