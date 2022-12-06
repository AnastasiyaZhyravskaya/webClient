package ru.ann.mast.webClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.ann.mast.webClient.model.Contingent;

@Service
public class ContingentService {
	private static final String URL = "http://localhost:8080/crudDataBaseApi/contingents";

	@Autowired
	RestTemplate restTemplate;

	public List<Contingent> getAllContingents() {
		ResponseEntity<List<Contingent>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Contingent>>() {
				});
		return responseEntity.getBody();
	}

	public void saveContingent(Contingent contingent) {
		System.out.println(contingent.getId());
		if(contingent.getId()==0)
		restTemplate.postForEntity(URL, contingent, Contingent.class);
		else restTemplate.put(URL, contingent);
	}

	public Contingent getContingent(int id) {
		return restTemplate.getForObject(URL +"/"+id, Contingent.class);
	}
	
	public void deleteContingent(int id) {
		restTemplate.delete(URL +"/"+id);
		
	}

}
