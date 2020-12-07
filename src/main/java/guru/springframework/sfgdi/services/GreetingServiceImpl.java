package guru.springframework.sfgdi.services;

/**
 * Created by ronnen on 2020-12-07.
 */


public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
