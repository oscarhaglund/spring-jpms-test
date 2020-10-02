# spring-jpms-test
Spring repo failing when converting to JPMS (Java Platform Module System)

This repository contains a test class with a very small spring test (A minimized extract of a much larger application that I am trying to migrate to JPMS).

The test class TestControllerTest runs successfully if the module-info.java file is removed. However with the file in place it fails to execute with the following exception:
```
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'RESTConfiguration': Unsatisfied dependency expressed through field 'fooAuthenticationProvider'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.spacemetric.spring.jpmstest.auth.FooAuthenticationProvider' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
```
