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
