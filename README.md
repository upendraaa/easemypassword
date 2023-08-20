## To browse h2 database
http://localhost:8080/h2-console

Added sample integration of h2 database

## To exclude from dev restart
spring.devtools.restart.exclude=static/**,public/**

## JRebel
JRebel is a productivity tool that allows developers to reload code changes instantly. JRebel skips the rebuild, restart, 
and redeploy cycle common in Java development

## Jmeter
For load testing of application

## Jconsole
To monitor JVM and manage the java application

## JVM Options for Garbage Collection:
You can control the garbage collection behavior and tune it based on your application's needs by specifying JVM options. Some commonly used JVM options related to garbage collection are:

-Xmx: Sets the maximum heap size.
-Xms: Sets the initial heap size.
-XX:NewSize: Sets the size of the young generation (eden + survivor spaces).
-XX:MaxNewSize: Sets the maximum size of the young generation.
-XX:NewRatio: Sets the ratio of the young generation to the old generation.

## Spring Cloud provides a set of tools and frameworks for building and managing microservices-based systems. Some key components include:

Service Discovery: Eureka for registering and locating services dynamically.
Load Balancing: Ribbon for client-side load balancing between service instances.
API Gateway: Zuul or Spring Cloud Gateway for routing and filtering requests to microservices.
Distributed Configuration: Spring Cloud Config for managing externalized configuration across microservices.
Circuit Breaker: Hystrix for preventing system failures caused by cascading failures in microservices.
Distributed Tracing: Sleuth and Zipkin for tracking requests as they traverse through microservices.

## what pattern does spring MVC implement to delegate request processing to controllers?
Front Controller

## Can we Autowired the static member?
No auto wired is for instance variable not for static member.

## What is actuator
Spring Boot Actuator provides several built-in endpoints that offer useful insights and functionalities for monitoring and managing your application. These endpoints can be accessed via 
HTTP requests and are useful for gathering information about the application's health, metrics, configuration, and more. 
By default, one can access the health and info endpoints
to access the other endpoints spring security is required

## what is attribute converter in spring? Or how to save enum value in database
Attribute converter, used to convert the object or enum to 
string to save in database, and return it back to object while
reading it

## Use of @Transactional
@Transactional annotation at the method level or at the class level. When applied at the class level, all public methods within the class will be transactional by default, unless overridden at the method level.

## Type of log and set log path in properties file
Error, Debug,Info,Warning, Trace

#### code isn't code unless it has code to test the code
Unit test perform the test the class in isolation not it's dependency
Integration test perform test the class with dependency

Unit test
In this generally to mock the dependency and use it

@RunWith(MockitoJUnitRunner.class)
public class SampleUnitTest{
}

Integration Test
In this @Autowired the dependency and use it
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleIntegrationTest {
}

Annotate the Test Class with @Transactional which will automatically rollback each test' transaction.

## @JsonIgnore
Use this annotation for password or any security related field
This field will be ignored during serialization and deserialization
@JsonIgnore
private String password;



## Difference between @Mock and @Mockbean
In summary, @MockBean is used in Spring integration tests to mock Spring beans within the context of the application, while @Mock is used in standalone unit tests to 
mock classes or interfaces without Spring's involvement. 

## Open API (Spring doc open api)
Spring doc open api is library to create the api documentation 
from the spring project
To integrate with swagger

#### Password encoder
#### Spring security
Authentication
@EnableSpringSecurity

Authorization
JWT Token

### Restful api
These are stateless, and have no session

JWT
Header -> Body ->Signature

### @PreAuthorize
Api is accessible only for the authorize user
@GetMapping
@PreAuthorize("hasRole('ROLE_ADMIN')")
public List<User> getAllUsers() {

}

#### Which Spring Security Feature is used for authentication?
A class implementing UserDetailsService since it is invoked by the AuthenticationManager.



