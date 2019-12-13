package it.ats.exercise.webproject;

import java.net.URL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class WebprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebprojectApplication.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");
	}

//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
			
			
			//final String url = "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1";

//			final HttpHeaders headers = new HttpHeaders();
//			headers.setContentType(MediaType.APPLICATION_JSON);
//			HttpEntity entity = new HttpEntity(headers);
			//RestTemplate restTemplate = new RestTemplate();
//			
//			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);	
//			SingeltonMemory.getInstance().setAtmCollection(response.getBody());

			//TestRestTemplate restTemplate = new TestRestTemplate();
			//ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + 8081 + "/atms").toString(), String.class);
			
//			 HttpHeaders headers = new HttpHeaders();
//			 headers.setContentType(MediaType.APPLICATION_JSON);
//			 HttpEntity entity = new HttpEntity(headers);
//			 
//			 ResponseEntity<String> response = restTemplate.exchange(
//					 "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1", HttpMethod.GET, entity, String.class);
//			
			
			
//					String atm = response.getBody();
//					restTemplate.getForObject("https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1", String.class);
//					SingeltonMemory.getInstance().setAtmCollection(response.getBody());
					
//		};
	//}
	
}
