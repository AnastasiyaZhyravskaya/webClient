package ru.ann.mast.webClient.model;


import java.time.LocalDateTime;

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
public class Application {

	private int id;

	private String applicationName;

	private String applicationBody;

	private Region region;

	private Company company;

	private Contingent responsible;

	private ApplicationStatus applicationStatus;

	private LocalDateTime dateCreate;

	private LocalDateTime dateInWork;

	private LocalDateTime dateCompleted;
	
}
