package in.phani.springboot.swaggeraggregator;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class SwaggeraggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggeraggregatorApplication.class, args);
	}
}
