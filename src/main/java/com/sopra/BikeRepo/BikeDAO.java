package com.sopra.BikeRepo;

import java.util.List;

import com.sopra.DAOProject.Bike;

public interface BikeDAO {
	
    public void save(Bike b);
    
    public void update(Bike b);
    
    public void delete(Bike b);
    
    public Bike find(Long id);
    
    public List<Bike> findAll();
}

