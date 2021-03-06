package com.greycampus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COUNTRY")
public class Country {
	@Id
	@Column(name = "id")
	private Integer counryID;
	private String countryCode;
	@Column(name = "name")
	private String countryName;
	

}
