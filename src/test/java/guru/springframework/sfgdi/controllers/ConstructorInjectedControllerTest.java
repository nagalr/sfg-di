package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by ronnen on 2020-12-07.
 */

/*
  Mimicking here the Spring-Context behaviour
  to create a Bean from a class on urn-time.
  here the ctor will create the instance.
  The Test class acts as 'Inversion Control'
  Meaning, responsible for creating and serving Instances.
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}