package com.personal.data.upload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.personal.data.upload.yaml.YamlPropertySourceFactory;

@Configuration
@PropertySource(factory = YamlPropertySourceFactory.class, value = "file:/respaldos/app-configs/common/config.yml")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:application.yml")
@EnableJpaAuditing
public class ApplicationConfiguration {

	public static String ENVIRONMENT;
	public static String PATH_TEMPLATES;
	
	@Value("${env}")
	public void setEnvironment(String environment) {
		ENVIRONMENT = environment;
	}

	@Value("${${env}.pathTemplates}")
	public void setPathTemplates(String pathTemplates) {
		PATH_TEMPLATES = pathTemplates;
	}
}