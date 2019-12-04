/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eduardo Valeriano Sevilla
	29 nov. 2019
	13:41:11
 *
 * 
 */
@RestController
@RequestMapping(value = "/demo")
public class HelloController {
	
	@GetMapping("/hello")
	public String demoHello() {
		return "hello";
	}
	
	@GetMapping("/page1")
	public String page() {
		return "pagina 1 solo con usuario y pass";
	}

}
