package com.microservice.forex.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.forex.entity.ForexEntity;
import com.microservice.forex.repository.ForexRepository;

@RestController
public class ForexController {
	@Autowired
	private Environment environment;
	@Autowired
	private ForexRepository forexRepository;
	private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ForexController.class.getName());

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ForexEntity retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ForexEntity forex = forexRepository.findByFromAndTo(from, to);
		forex.setPort(Integer.parseInt(environment.getProperty("server.port")));
		LOG.info(forex.toString());
		return forex;
	}
}
