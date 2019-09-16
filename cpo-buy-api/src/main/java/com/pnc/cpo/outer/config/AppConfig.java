package com.pnc.cpo.outer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

//@PropertySource(value = { "classpath:database.properties" })
@Configuration
public class AppConfig {

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("application");
		source.setBasename("message");
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}
}
