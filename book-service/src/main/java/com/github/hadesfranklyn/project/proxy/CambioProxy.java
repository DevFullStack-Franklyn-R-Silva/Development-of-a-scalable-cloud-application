package com.github.hadesfranklyn.project.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.hadesfranklyn.project.response.Cambio;

/*
 * If wanted to scale book service just add more localhost
 * @FeignClient(name = "cambio-service", url = "localhost:8000, 
 * localhost:8001, localhost:8002, localhost:8003")
 * more is still hardcoded, scaling like this!
 */
@FeignClient(name = "cambio-service", url = "localhost:8000")
public interface CambioProxy {

	@GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(
			@PathVariable("amount") Double amount, 
			@PathVariable("from") String from,
			@PathVariable("to") String to);
}
