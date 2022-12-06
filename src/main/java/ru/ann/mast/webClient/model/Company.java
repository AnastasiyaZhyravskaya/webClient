package ru.ann.mast.webClient.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

	private int id;

	private String companyName;

	private String representativeOfCompany;
	
	private String representativePhone;
	
	private String representativeEmail;

	private Region region;

}
