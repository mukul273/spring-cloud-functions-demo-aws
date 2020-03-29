package com.spring.cloud.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionalDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCloudFunctionalDemoApplication.class, args);
	}

	/*@Bean
	public Function<String, String> function() {
		return input -> input;
	}

	@Bean
	public Consumer<String> consume() {
		return input -> {
			log.info("functional programming with Consumer Function "+input);
		};
	}

	@Bean
	public Supplier<String> supply() {
		return () -> "functional programming with Supplier Function";
	}*/
}
