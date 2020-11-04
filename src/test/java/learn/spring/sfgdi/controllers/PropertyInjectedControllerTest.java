package learn.spring.sfgdi.controllers;

import learn.spring.sfgdi.services.ConstructorGreetingService;
import learn.spring.sfgdi.services.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}