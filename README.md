# SpringDataAndHibernate
### Comparison of working with JPA, native Hibernate and Spring Data Jpa
- JPA: Uses the general JPA API and requires a persistence provider
  - We can switch between persistence providers from the configuration.
  - Requires explicit management of the EntityManagerFactory, EntityManager, and transactions
  - The configuration and the amount of code to be written is similar to the native Hibernate native approach.
  - We can switch to the JPA approach by constructing an EntityManagerFactory from a native Hibernate configuration.
- Native Hibernate:
  - Uses the Hibernate API. You are locked into using this chosen framework.
  - Builds its configuration starting with the default Hibernate configuration files (hibernate.cfg.xml or hibernate.properties).
  - Requires explicit management of the SessionFactory, Session and transactions.
  - The configuration and the amount of code to be written are similar to the JPA approach.
  - We can switch to the native Hibernate native approach by unwrapping a SessionFactory from an EntityManagerFactory or Session from an EntityManager.
- Spring Data JPA:
  - Needs additional Spring Data dependencies in the project
  - The configuration will also take care of the creation of beans needed for the project, including the transaction manager
  - The repository interface only needs to be declared, and Spring Data will create an implementation for it as a proxy class with generated methods that interact with the database
  - The necessary repository is injected and not explicitly created by the programmer.
  - This approach requires that least amount of code to be written, as the configuration takes care of most of the burden.

The Java programming language is the most widely used today.
Databases are everywhere, with their particular ways to be
accessed. There are alternative frameworks for mapping Java
classes to a database. What should we choose for a Java
application and why? JPA, Native Hibernate, and Spring Data JPA
are among the most widely used frameworks to solve this
problem. Each of them comes with its own characteristics,
advantages, and shortcomings. Selecting one of them should be
a decision with appropriate fundamentals.