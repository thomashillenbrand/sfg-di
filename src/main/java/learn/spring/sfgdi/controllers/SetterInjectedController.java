package learn.spring.sfgdi.controllers;

import learn.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // creates as a bean in the context
public class SetterInjectedController {

    @Qualifier("setterGreetingService")
    @Autowired // tells spring to inject a greeting service here automatically fromt he context
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
