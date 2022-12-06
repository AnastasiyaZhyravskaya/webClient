package ru.ann.mast.webClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.ann.mast.webClient.model.Engineer;

@Service
public class EngineerService {
	private static final String URL = "http://localhost:8080/crudDataBaseApi/engineers";

	@Autowired
	RestTemplate restTemplate;

	public List<Engineer> getAllEngineers() {
		ResponseEntity<List<Engineer>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Engineer>>() {
				});
		return responseEntity.getBody();
	}

	public void saveEngineer(Engineer engineer) {
		System.out.println(engineer.getId());
		if(engineer.getId()==0)
		restTemplate.postForEntity(URL, engineer, Engineer.class);
		else restTemplate.put(URL, engineer);
	}

	public Engineer getEngineer(int id) {
		return restTemplate.getForObject(URL +"/"+id, Engineer.class);
	}
	
	public void deleteEngineer(int id) {
		restTemplate.delete(URL +"/"+id);
		
	}
	
	

}
