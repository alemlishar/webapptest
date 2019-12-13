package it.ats.exercise.webproject;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import it.ats.exercise.webproject.SingeltonMemory;


@RestController
public class AtmRestApi {

	final String url = "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1";

	@RequestMapping(value = "/atms",method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getAtms() {

		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(headers);
		RestTemplate restTemplate = new RestTemplate();


		if(SingeltonMemory.getInstance().getAtmCollections() != null) {
			return new ResponseEntity<String>(SingeltonMemory.getInstance().getAtmCollections(),headers, HttpStatus.OK);}
		else {
			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);	
			SingeltonMemory.getInstance().setAtmCollection(response.getBody());
			return new ResponseEntity<String>(response.getBody(),headers, HttpStatus.OK);}
	}

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ResponseEntity<String> greet() {

		return new ResponseEntity<String>("hello",  HttpStatus.OK);
	}
}
