package com.sopra.DAOProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
    @Id
    private Long id;
    private String model;
    private double price;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Bike(Long id, String model, double price) {
		this.id = id;
		this.model = model;
		this.price = price;
	}
	
	
	public Bike() {
	
	}
	
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", model=" + model + ", price=" + price + "]";
	}

    
}
