package com.industrial.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_asset")
public class Asset implements Serializable {

	private static final long serialVersionUID = -5200453017136719961L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "model")
	private String model;
	@Column(name = "manufacturer")
	private String manufacturer;
	@Column(name = "serial")
	private String serial;
	@Column(name = "create_date")
	private Date createDate;

}
