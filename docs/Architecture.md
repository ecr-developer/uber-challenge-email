# Architecture

This section contains the suggested solution and all the architecture definitions.

##  Table of Contents

* [Email Microservice](../README.md#email-microservice---uber-code-challenge-for-back-end)
    * [Comments](../README.md#comments)
    * [Guides](../README.md#guides)
    * [Announcements](../README.md#announcements)
    * [License](../README.md#license)
* [Discovery](./Discovery.md)
    * [Emails Provider](./Discovery.md#emails-provider)
    * [Business Rules](./Discovery.md#business-rules)
* Architecture
    * [Design and architectural decisions](#design-and-architectural-decisions)

## Design and architectural decisions

- Architecture based on microservices;
- Microservices can be replaced for others with technology different;
- Each microservice will have its own CI/CD process;
- Horizontal scalability:
    * The scaling process can be configured at a microservice level;
    * All microservices will work in a "Stateless" way;
    * The scaling process will involve increasing the number of Kubernetes PODs;
    * The autoscaling process will also be used through an HPA (Horizontal Pod Autoscaler) feature;
- Service discovery:
    * There will be no need to work with a Service Discovery system such as "Consul";
    * The project will use Kubernetes to orchestrate the containers, so Service Discovery is already part of the process;
- Messaging:
    * As part of the communication between the microservices is asynchronous, a messaging system is required;
    * RabbitMQ was chosen for this case;
    * Why not Apache Kafka or Amazon SQS, among others?
        * As we will only be using the messaging feature for this solution, the project would be using very little of what Apache Kafka has to offer;
- Resilience and self-healing:
    * To ensure resilience if one or more microservices go down, queues will be essential;
    * If a message comes in a pattern that is not expected for a particular microservice, the microservice may reject it and it may automatically be forwarded to a dead-letter queue;
    * Because Kubernetes has Circuit Breaker, Liveness and Readiness probes:
        * If a container fails, it will be automatically restarted or even recreated;
        * If a container can't handle a certain amount of traffic, we have the option of working with Circuit Breaker to prevent it from receiving any more requests while it's recovering;
    * The emails will be saved in a NoSQL database, so we can adopt the strategy that if we need to reprocess the emails, we can just retrieve them from the database;
    * For this first project, we will save emails for a month and then evaluate whether we can reduce the time or increase it, based on the metrics of the service's use;

![EndStateOfTheProposedSolution](./img/EndStateOfTheProposedSolution.png)

