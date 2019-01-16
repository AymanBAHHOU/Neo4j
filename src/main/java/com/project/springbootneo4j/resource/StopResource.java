package com.project.springbootneo4j.resource;

import java.util.Collection;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springbootneo4j.model.Distance;
import com.project.springbootneo4j.model.Node;
import com.project.springbootneo4j.model.Stop;
import com.project.springbootneo4j.service.StopService;

@RestController


public class StopResource {
	
	@Autowired
	StopService stopService;
	
	@GetMapping("/stops")
	public Iterable<Stop> getAll() {
		return stopService.getAll();
	}
	
	@GetMapping("/itineraries")
	
	public Node[] getItineraries(@PathParam("depart") String depart, @PathParam("destination") String destination) {
		System.out.println(depart);
		System.out.println(destination);
		System.out.println("eeeeee" + stopService.getItineraries(depart, destination).length);
		return stopService.getItineraries(depart, destination);
		
	}
	
	@GetMapping("/distance")
	public Distance getDistance() {
		return stopService.getDistance();
	}
	
}
