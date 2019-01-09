package com.project.springbootneo4j.model;

import java.util.List;	
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity 
public class Stop extends Node{
	
	@Id
    @GeneratedValue
	private Long id;
	private String name;
	
	@Relationship(type = "ARRET_A" , direction = Relationship.INCOMING )
	private List<Bus> buses;
	
	public List<Bus> getBuses() {
		return buses;
	}
	
	public Stop() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
