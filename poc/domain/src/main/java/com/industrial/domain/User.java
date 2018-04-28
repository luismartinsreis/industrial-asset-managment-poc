package com.industrial.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_user")
public class User {

	@Column(name = "cod_user")
	private int id;
	@Column(name = "login")
	private String nome;
	@Column(name = "name")
	private String userName;
	@Column(name = "last_update")
	private Date lastUpdate;
	@Column(name = "last_login")
	private Date lastLogin;
	@Column(name = "active")
	public boolean active;
	@Column(name = "profile")
	public String profile;
}
