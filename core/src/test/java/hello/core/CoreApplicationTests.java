package hello.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreApplicationTests {
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CoreApplication.class);

	@Test
	@DisplayName("모든 빈 출력하기")
	void findAllBeans() {
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			Object bean = ac.getBean(beanDefinitionName);
			System.out.println("beanDefinitionName = " + beanDefinitionName + " bean = " + bean);
		}
	}
}
