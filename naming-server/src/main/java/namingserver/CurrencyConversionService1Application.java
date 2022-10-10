package namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyConversionService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionService1Application.class, args);
	}

}
