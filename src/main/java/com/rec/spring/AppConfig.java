package com.rec.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Service exampleServiceBean() {
		return new ExampleService();
	}

	@Bean
	public Foo fooBean(Service service) {
		return new Foo(service);
	}

}
