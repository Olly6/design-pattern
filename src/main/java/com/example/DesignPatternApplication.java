package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignPatternApplication {

	@Bean
	protected RuleInner.CRuleHandler cRuleHandler(){
		return new RuleInner.CRuleHandler();
	}
	@Bean
	protected RuleInner.DRuleHandler dRuleHandler(){
		return new RuleInner.DRuleHandler();
	}
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}
}
