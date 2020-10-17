package com.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author changxu13
 * @date 2020/10/17 16:27
 */
@Entity
@Table(name = "position")
public class Position {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private String salary;

	@Column(name = "city")
	private String city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
