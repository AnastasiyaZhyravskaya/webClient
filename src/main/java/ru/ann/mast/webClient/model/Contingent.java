package ru.ann.mast.webClient.model;


import java.util.List;

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
public class Contingent {

	private int id;

	private String name;

	private String surname;

	private String patronymic;

	private List<Engineer> engineers;
	
}
