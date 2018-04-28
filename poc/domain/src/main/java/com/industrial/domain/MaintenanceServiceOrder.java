package com.industrial.domain;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class MaintenanceServiceOrder {
	private Long id;
	private Date requestDate;
	private String description;
	private Asset asset;
	private User resquestUser;
	private String additionalData;

}
