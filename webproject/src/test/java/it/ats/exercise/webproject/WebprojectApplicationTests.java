package it.ats.exercise.webproject;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class WebprojectApplicationTests {
	
	@LocalServerPort
	private int port;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testGet() throws  Exception{
		
		AtmRestApi atmrestapi = new AtmRestApi();
		TestRestTemplate restTemplate = new TestRestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/atms").toString(), String.class);
		assertEquals(atmrestapi.getAtms().getBody(), response.getBody());
	}
}
