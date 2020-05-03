package com.reeta.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetinController {
	
	@Autowired
	private DBSetting dbSetting;
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("${StaticString: Default value}")
	private String defaultValue;
	
	@Value("${my.list.values}")
	private List<String> listOfValues;
	
	@Value("#{${db.connection}}")
	private Map<String,String> mapValues;
	
	

	
	/* Value from YML file*/
	@Value("${name}")
	private String name;
	/* Value from PROPERTIES file*/
	@Value("${server.name}")
	private String serverName;
	
	@Value("${boolean1}")
	private boolean boolean1;
	
	@Value("${boolean2}")
	private boolean boolean2;
		
	@GetMapping("/greetings")
	public String greeting() {
		return boolean1 + " "+boolean2 ; 
	}
	

}
