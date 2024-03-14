package com.sopra.BikeRepo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

import com.sopra.DAOProject.Bike;


public class BikeRepo implements BikeDAO{
	
	
	private SessionFactory sf;

    public BikeRepo(SessionFactory sf) {
        this.sf = sf;
    }

    
	@Override
    public void save(Bike b) {
		
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(b);
        s.getTransaction().commit();
    }

    @Override
    public Bike find(Long id) {
        Session s = sf.openSession();
        s.beginTransaction();
        Bike b = s.get(Bike.class, id);
        s.getTransaction().commit();
        return b;
    }

    @Override
    public List<Bike> findAll() {
        Session s = sf.openSession();
        s.beginTransaction();
        List<Bike> bs = s.createQuery("from Bike", Bike.class).list();
        s.getTransaction().commit();
        return bs;
    }

    @Override
    public void update(Bike b) {
        Session s = sf.openSession();
        s.beginTransaction();
        s.update(b);
        s.getTransaction().commit();
    }

    @Override
    public void delete(Bike b) {
        Session s = sf.openSession();
        s.beginTransaction();
        s.delete(b);
        s.getTransaction().commit();
    }

	
}



	