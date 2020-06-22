# Spring Boot - Accessing and Adding Data

## Dependencies
* Spring Web
* Spring Data JPA
* H2 Database
* Spring Boot Dev Tools
* Thymeleaf

### Dependencies

Had to update my Java version in pom.xml to 1.14 to make my local JDK

### App Properties

Added a few lines to be able to access out H2 database throiugh console and to be able to load an external SQL source


### JPA

JPA - Java Persistance API
Collection of methods and classes for storing data in a database
Where does it come from?

- Dependency - Spring Boot JPA

### Annotations
* @Entity - designates a POJO class as an entity so that we can use iit with JPA
* @Id - JPA will recognize this as an object's primary key
* @GeneratedValue - allows the database to set the value of the field
* @Column - attribute is stored in a database column by the same name
* @CreationTimeStamp - sets the value of the field to the current time and date during creation (exactly once)

### Thymeleaf
Thymeleaf a server-side Java templating engune for both web and standalone JAR apps

Thymeleaf sits on top of existing HTML, so we can write HTML like normal and just add a few things to make it a thymeleaf template

### Thymeleaf "Dialect" Basics

- \${...} : Variable expressions
- \*{...} : Selection expressions
- #{...} : Message (i18n) expressions
- @{...} : link (URL) expressions
- ~{...} : Fragment expressions

### Repository

A repository is necessary in Spring applications.