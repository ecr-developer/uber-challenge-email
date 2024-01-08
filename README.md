[![license MIT][License Badge]][License Page]
 &nbsp; &nbsp; &nbsp;
[![commits since][Commits Since Badge]][Commit Page]
[![last commit][Last Commit Badge]][Commit Page]


[License Badge]: https://img.shields.io/github/license/ecr-developer/uber-challenge-email
[License Page]: https://github.com/ecr-developer/uber-challenge-email/blob/main/LICENSE

[Commits Since Badge]: https://img.shields.io/github/commits-since/ecr-developer/uber-challenge-email/latest?label=new%20unreleased%20changes
[Last Commit Badge]: https://img.shields.io/github/last-commit/ecr-developer/uber-challenge-email?color=yellow
[Commit Page]: https://github.com/ecr-developer/uber-challenge-email/commits

# Email Microservice - Uber Code Challenge for back-end

The aim of this project is to demonstrate a solution to the challenge posed to professionals who apply for Uber's open opportunities.

- [Uber coding challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/README.md) / [Guidelines](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md)

Of the 4 challenges, I chose the **Email Service** focused on the back-end.

## Comments

- The challenge is not currently used, I am doing it to contribute to the development of your learning or as a possible reference;
- My solution is not the only one, there are several ways of doing it and the best one is the one you propose to do, you just have to apply the best practices on the market;
- My goal is to try to transfer the knowledge or skills that the market normally requires of a back-end engineer;

## Table of Contents

* Email Microservice
    * [Comments](#comments)
    * [Guides](#guides)
    * [Announcements](#announcements)
    * [License](#license)
* [Discovery](./docs/Discovery.md)
    * [Emails Provider](./docs/Discovery.md#emails-provider)
    * [Business Rules](./docs/Discovery.md#business-rules)
* [Architecture](./docs/Architecture.md#architecture)
    * [Design and architectural decisions](./docs/Architecture.md#design-and-architectural-decisions)
    * [Features Presentation](./docs/Architecture.md#features-presentation)
        * [Strategic modeling with DDD](./docs/Architecture.md#strategic-modeling-with-ddd-domain-driven-design)
        * [Clean Architecture](./docs/Architecture.md#clean-architecture)

## Guides

* In a project team that adopts the Agile Scrum methodology, until the actual development phase of something, there are important steps that, if ignored, the feature will be delivered with possible problems:
    * **Product Backlog Creation:**
        * The product owner creates a prioritized list of features and requirements known as the Product Backlog;
    * **Sprint Planning:**
        * The team, including the product owner and Scrum Master, collaboratively plans the work for the upcoming sprint (iteration);
        * Tasks are selected from the Product Backlog based on priority and team capacity;
    * **Sprint (Iteration):** 
        * The development team works on the selected tasks during the sprint, which typically lasts 2-4 weeks;
        * Daily Scrum meetings are held for brief status updates and to identify and resolve any impediments;
    * **Sprint Review:**
        * At the end of the sprint, the team demonstrates the completed work to stakeholders, including the product owner;
        * Feedback is gathered to inform future iterations;
    * **Sprint Retrospective:**
        * The team reflects on the sprint, discussing what went well, what could be improved, and any adjustments needed for the next sprint;
        * Continuous improvement is a key focus;
    * **Product Increment and Release:**
        * The completed and potentially shippable product increment is delivered at the end of each sprint;
        * Releases can occur at the end of any sprint, providing stakeholders with valuable features sooner;
    * **Backlog Refinement:**
        * The Product Backlog is regularly refined, with new items added, prioritized, or updated based on changing requirements and feedback;
    * **Roles:**
        * **Product Owner:** Represents the stakeholders and defines the product features;
        * **Scrum Master:** Facilitates the Scrum process, removes obstacles, and ensures adherence to Scrum principles;
        * **Development Team:** Cross-functional team responsible for delivering the product increment;
    * **Artifacts:**
        * **Product Backlog:** Prioritized list of features and requirements;
        * **Sprint Backlog:** The subset of Product Backlog items selected for the sprint;
        * **Product Increment:** The sum of completed work in a sprint;
    * **Time-Boxing:**
        * Fixed-length iterations (sprints) and meetings (Sprint Planning, Daily Scrum, Sprint Review, Sprint Retrospective) are time-boxed to ensure efficiency and focus;
* Agile Scrum emphasizes collaboration, adaptability, and delivering value iteratively, allowing teams to respond quickly to changing requirements and customer feedback.
* As a way of separating the tasks to be carried out, we will adopt the following convention:
```
[CHAP-XXX] Description
```
1. CHAP - Challenge in abbreviation;
2. XXX - Task number;
3. Description - Task description that will be execute;

## Announcements

All updates to this project are documented in our [CHANGELOG](./CHANGELOG.md)

## License

[The MIT License (MIT)](LICENSE)