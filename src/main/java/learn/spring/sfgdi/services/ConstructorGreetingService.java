package learn.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // makes this available for injection as a spring component
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
