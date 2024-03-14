package com.sopra.DAOProject;

import org.hibernate.Session;
//Main.java
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sopra.BikeRepo.BikeRepo;



public class App {
 public static void main(String[] args) {
     
     Configuration cfg = new Configuration();
 	 cfg.configure();
 	
 	 SessionFactory sf = cfg.buildSessionFactory();
 	 
 	 AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
 	 ac.scan("com.sopra.BikeRepo");
 	 ac.refresh();
 	 
 	 BikeRepo bRepo = new BikeRepo(sf);
 	 
 	 
     //BikeRepo bRepo = new BikeRepo(sf);

     
     Bike b1 = new Bike();
     b1.setId(1L);
     b1.setModel("Bajaj Pulsar");
     b1.setPrice(135000);
     bRepo.save(b1);
     
     Bike b2 = new Bike();
     b2.setId(2L);
     b2.setModel("BMW GSA 1250");
     b2.setPrice(1350000);
     bRepo.save(b2);
     
     Bike b3 = new Bike();
     b3.setId(3L);
     b3.setModel("Ducati Scrambler");
     b3.setPrice(985000);
     bRepo.save(b3);
    
     Bike resBike = bRepo.find(1L);
     System.out.println(resBike);
     
     System.out.println(bRepo.findAll());

  
     bRepo.delete(resBike);
     
     sf.close();
 }
}
