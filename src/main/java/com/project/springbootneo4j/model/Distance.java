package com.project.springbootneo4j.model;


import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "suivant")
public class Distance {
	
	@Id
	@GeneratedValue
	private List<Integer> distances = new ArrayList<>();

	@StartNode
	private Stop depart;

	@EndNode
	private Stop arrivee;
	

	public Stop getDepart() {
		return depart;
	}

	public List<Integer> getDistances() {
		return distances;
	}

	public void setDistances(List<Integer> distances) {
		this.distances = distances;
	}

	public void setDepart(Stop depart) {
		this.depart = depart;
	}

	public Stop getArrivee() {
		return arrivee;
	}

	public void setArrivee(Stop arrivee) {
		this.arrivee = arrivee;
	}

	public Distance(Stop depart, Stop arrivee) {
		super();
		this.depart = depart;
		this.arrivee = arrivee;
	}
	
	public Distance() {
		 
	}
}
