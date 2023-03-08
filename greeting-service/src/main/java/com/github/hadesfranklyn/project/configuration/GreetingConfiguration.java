package com.github.hadesfranklyn.project.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {

	// attributes
	private String greeting;
	private String defaultValue;

	// constructor
	public GreetingConfiguration() {
	}

	// get and set
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
