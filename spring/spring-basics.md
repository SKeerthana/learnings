# Spring basic concept

- Spring is a dependency injection framework. Helps to build loosely-coupled application
- Reduces boilerplate code
- Also provides good integration with other frameworks.

### Basic terminologies used:

1. Beans - Objects which are managed by spring (achieved using @Component annotation)
2. Dependency injection - Dependencies required by the beans are automatically injected into them (achieved using @Autowired annotation)
3. IOC container (inversion of control) - The framework which creates and manages beans

Two implementations of IOC Container :
--------------------------------------
    - Bean Factory - Contains core features of spring. Provides basic management of beans and wiring dependencies.
	- Application context - Bean factory + AOP features + i18n + WebApplicationContext etc...

### CDI (context dependency injection) annotations:
CDI is a standard set as part of Java EE for dependency injection in Java.

Below are the few  CDI annotations corresponding to Spring annotations:

@Inject - @Autowired
@Named  - @Component

### Useful spring annotations:

@Component - Generic annoation that used to specify object to be managed by spring i.e. bean

Three specific annotations for bean based on functionality: 
@Controller - Web interface layer bean
@Service - Business logic bean
@Repository - bean which interacts with data layer

@ComponentScan - Specifies the classpath from where to look for beans 
@PropertySource - Specifies the property file location

TODO:
-----
Expand on the below concepts

@Scope - singleton, prototype, proxy
@Primary
@Qualifier

@Value
@PostConstruct
@Predestroy

### SpringMVC 
	- provides decoupled way of developing web application. 

	Concepts below make it easy to develop spring applications: 
		- DispatcherServlet: concerned with basic front controller part
		- ModelAndView
		- ViewResolver

