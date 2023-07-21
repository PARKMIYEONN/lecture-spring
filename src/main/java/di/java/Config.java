package di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {
	
//	@Bean
//	public Car car() {
//		return new Car();
//	}
//	
//	@Bean(name="hankook")
//	public Tire hankookTire() {
//		return new HankookTire();
//	}
//	
//	<bean class="di.java.KumhoTire" id="kumho"/>
//	@Bean(name="kumho")
//	public Tire kumhoTire() {
//		return new KumhoTire();
//	}

}
