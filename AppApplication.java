package redflix_app.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import redflix_app.app.vista.vista1;

@SpringBootApplication
@ComponentScan("redflix_app.app")
public class AppApplication {

	public static void main(String[] args) {
		new vista1().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            SpringApplication.run(AppApplication.class, args);

        }

}
