package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//global validate설정을 위해선 implements WebMvcConfigurer
public class ItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }

/*	@Override
	public Validator getValidator() {
		return new ItemValidator();
	}*/
}
