package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Aquarium;
import com.klef.soa.exam.repository.AquariumRepository;

@Service
public class AquariumService {

	@Autowired
	private AquariumRepository repo;

	
	 public Aquarium addAquarium(Aquarium u) {
	        return repo.save(u);
	    }

	    public List<Aquarium> displayAll() {
	        return repo.findAll();
	    }
	    

	    public void deleteById(Long id) {
	        repo.deleteById(id);
	    }
	
}
