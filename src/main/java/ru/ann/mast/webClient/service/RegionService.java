package ru.ann.mast.webClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.ann.mast.webClient.model.Region;

@Service
public class RegionService {
	private static final String URL = "http://localhost:8080/crudDataBaseApi/regions";

	@Autowired
	RestTemplate restTemplate;

	public List<Region> getAllRegions() {
		ResponseEntity<List<Region>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Region>>() {
				});
		return responseEntity.getBody();
	}

	public void saveRegion(Region region) {
		System.out.println(region.getId());
		if(region.getId()==0)
		restTemplate.postForEntity(URL, region, Region.class);
		else restTemplate.put(URL, region);
	}

	public Region getRegion(int id) {
		return restTemplate.getForObject(URL +"/"+id, Region.class);
	}
	
	public void deleteRegion(int id) {
		restTemplate.delete(URL +"/"+id);
		
	}

}
