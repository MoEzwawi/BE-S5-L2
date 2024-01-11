package MoEzwawi.BES5L3;

import MoEzwawi.BES5L3.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeS5L3Application {

	public static void main(String[] args) {
		SpringApplication.run(BeS5L3Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeS5L3Application.class);
		ctx.getBean(Menu.class).printMenu();
	}

}
