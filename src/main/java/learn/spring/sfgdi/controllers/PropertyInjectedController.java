package learn.spring.sfgdi.controllers;

import learn.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // creates this class as a bean in the context
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired // tells the controller to inject a greetingService
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

