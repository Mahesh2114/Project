package com.greycampus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.LastModifiedDate;


@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "cid")
	private Integer cid;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "phone")
	private Long phone;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	
	private String state;
	private String country;
	private String created_by;
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date created_on;	
	private String modified_by;
	private Date modified_on;
    @PrePersist
	private void onCreate() {
		created_on=new Date();	
	}
	@PreUpdate
	private void onUpdate() {
		modified_on=new Date();
	}

	
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Date getModified_on() {
		return modified_on;
	}
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Customer(Integer cid, String name, Long phone,String type, String street, String city, String state,
			String country,String created_by,Date date,String modified_by) {
		super();
		this.cid = cid;
		this.name = name;
		this.type=type;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.created_by=created_by;
		this.created_on=date;
		this.modified_by=modified_by;
		this.modified_on=date;
	}
	public Customer() {
		super();
		
	}
	
	
	
}
