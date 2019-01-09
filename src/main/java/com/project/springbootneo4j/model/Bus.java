package com.project.springbootneo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Bus extends Node{
	
	@Id
    @GeneratedValue
	private Long id;
	private Long immat;
	
	public Bus() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getImmat() {
		return immat;
	}

	public void setImmat(Long immat) {
		this.immat = immat;
	}
	
	
	
	

}
