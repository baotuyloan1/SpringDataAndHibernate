##This project covers:
- Introducing the Hibernate and Spring Data Project
- Developing a "Hello World" with Jakarta Persistence API, Hibernate and Spring Data.
- Examining the configuration and integration options.

JPA (Jakarta Persistence API, formerly Java Persistence API) is the specification defining an API that manages the persistence of objects and object/relational mappings - it specifies what muse be done to persist objects. 
Hibernate, the most popular implementation of this specification, will make the persistence happen. Spring Data makes the implementation of the persistence layer even more efficient;it's an umbrella project that adheres to the Spring framework principles and offers an even simple approach.


1. Introducing Hibernate:

Object/relational mapping (ORM) is a programming technique for making the connection between the incompatible worlds of object-oriented systems and relational database. Hibernate is an ambitious project that aims to provide a complete solution to the problem of managing persistent data in java.
Today, Hibernate is not only an ORM service but also a collection of data management tools  extending well beyond ORM.

The Hibernate project suite includes the following
- The Hibernate ORM - Hibernate ORM consists of a core, a base service for persistence with SQL databases, and a native proprietary API. Hibernate ORM is the foundation for several of the other projects in the suite, and it's the oldest Hibernate project. You can use Hibernate ORM on its own, independent of any framework or any particular runtime environment with all JDKs. As long as a data source is accessible, you can configure it for Hibernate, and it works.
- Hibernate EntityManager - This is Hibernate's implementation of standard Jakarta Persistence API. It's an optional module you can stack on top of Hibernate ORM. Hibernate's native features are a superset of the JPA persistence features in every respect.
- Hibernate Validator - Hibernate provides the reference implementation of the Bean Validation (JSR 303) specification. Independent of other Hibernate projects, it provides declarative validation for domain model (or any other) classes.
- Hibernate Envers- Envers is dedicated to audit logging and keeping multiple versions of data in the SQL database. This helps add data history and audit trails to the application, similar to any version control systems you might already be familiar with, such as Subversion or Git.
- Hibernate Search - Hibernate Search keeps an index of the domain model data