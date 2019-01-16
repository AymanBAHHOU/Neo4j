package com.project.springbootneo4j.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springbootneo4j.model.Distance;
import com.project.springbootneo4j.model.Node;
import com.project.springbootneo4j.model.Stop;
import com.project.springbootneo4j.repository.StopRepository;

@Service
public class StopService {

	@Autowired
	StopRepository stopRepository;
	
	public Iterable<Stop> getAll() {
		
		return stopRepository.findAll();
	}

	public Node[] getItineraries(String depart, String destination) {
		return stopRepository.getAllStops(depart, destination);
	}
	
	public Distance getDistance() {
		System.out.println("heee" + stopRepository.getDistance());
		return stopRepository.getDistance();
	}

}
