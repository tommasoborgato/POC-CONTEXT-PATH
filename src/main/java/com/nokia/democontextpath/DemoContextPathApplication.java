package com.nokia.democontextpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoContextPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoContextPathApplication.class, args);
	}
}


@RestController
class TestRestService {
	private String url;
	private String username;
	private String password;

	@RequestMapping(method = RequestMethod.GET, value = "/srv/test" , produces = "text/html")
	String test(){
		return "<div style=\"background: green\">OK</div>";
	}
}
