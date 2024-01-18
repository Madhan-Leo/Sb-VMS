package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@Column(name = "vehid")
	private int id;
	@Column(name = "vehowner")
	private String owner;
	@Column(name = "vehname")
	private String name;
	@Column(name = "vehnum")
	private String number;
	@Column(name = "vehtype")
	private String type;

	public Vehicle() {
		super();
		
	}

	public Vehicle(int id, String owner, String name, String number, String type) {
		super();
		this.id = id;
		this.owner = owner;
		this.name = name;
		this.number = number;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String GetName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", owner=" + owner + ", name=" + name + ", number=" + number + ", type=" + type
				+ "]";
	}
	
	
}
