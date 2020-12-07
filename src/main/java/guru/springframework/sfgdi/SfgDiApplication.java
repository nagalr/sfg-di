package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		// catch the Spring context into a variable 'ctx'
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// Get the bean from the context
		// the argument name of the bean-class
		// should start with lower-case char ("myController")
		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println(greetings);
	}

}
