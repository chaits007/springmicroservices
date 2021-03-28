package com.chaits.microservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chaits.microservices.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeRate(@PathVariable String from, @PathVariable String to) {
		return new  ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
	}

}
