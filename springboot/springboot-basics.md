### Goals of spring boot

1. Enable to quickly build production ready applications

2. Provide common non-functional features
	- metrics
	- health checks
	- externalized config
	- embedded servers

Spring Boot does NOT:
	- do code generation
	- Neither an application server nor a web server

### Features:

1. Provides quick starter projects with spring MVC, spring core, validation, logging, auto configuration enabled etc...
2. Provides embedded servers to run the code - Tomcat, Jetty or Undertow
3. Also provides production-ready features
	 - metrics and health checks (using springboot actuator) 
 	 - externalized configuration (springboot core)

### Useful Annotaion:
@SpringBootApplication - indicates the spring context file, enables auto config, component scan.

SpringApplication.run() - used to run spring context.

DispatcherServlet - concerned with basic front controller part.

