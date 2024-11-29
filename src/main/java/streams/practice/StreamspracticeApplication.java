package streams.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import store_sales.controller.SalesController;

@SpringBootApplication
@EntityScan(basePackages = "store_sales.entity")
@EnableJpaRepositories(basePackages = "store_sales.repo")
@ComponentScan(basePackages = {"store_sales.controller", "store_sales.service", "store_sales.dto"}) // Scans for components (controllers, services, etc.)

public class StreamspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamspracticeApplication.class, args);
		System.out.println("hello");

	}

}
