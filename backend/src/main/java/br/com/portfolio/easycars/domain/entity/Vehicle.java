package br.com.portfolio.easycars.domain.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String brand;
	private int year;
	private boolean disposable;
	private String color;
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Deprecated
	public Vehicle() {}
	
	public Vehicle(String name, String brand, int year, boolean disposable, String color, Category category) {
		this.name = name;
		this.brand = brand;
		this.year = year;
		this.disposable = disposable;
		this.color = color;
		this.category = category;
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isDisposable() {
		return disposable;
	}
	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
