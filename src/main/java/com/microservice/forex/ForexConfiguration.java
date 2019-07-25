package com.microservice.forex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class ForexConfiguration {

	@Bean 
	public Sampler defaultSampler() {
	   return Sampler.ALWAYS_SAMPLE;
	}
}
