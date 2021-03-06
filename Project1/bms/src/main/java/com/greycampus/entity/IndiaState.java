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
@Table(name = "INDIA_STATE")
public class IndiaState {
	@Id
	@Column(name = "id")
	private Integer state_No;
	@Column(name = "name")
	private String state_Name;

}
