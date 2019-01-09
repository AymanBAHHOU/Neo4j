package com.project.springbootneo4j.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.project.springbootneo4j.model.Distance;
import com.project.springbootneo4j.model.Node;
import com.project.springbootneo4j.model.Stop;

public interface StopRepository extends Neo4jRepository<Stop , Long> {

	@Query("MATCH (Ocean:Stop {name:'Ocean'}), (Soussi:Stop {name:'Soussi'})\r\n" + 
		   "MATCH p = shortestPath((Ocean)-[:ARRET_A*]-(Soussi))\r\n" + 
		   "RETURN p")
	Node[] getAllStops();
	
	@Query("MATCH (a:Stop {name:'Ocean'})-[d:suivant]->(b:Stop {name:'Soussi'}) RETURN d")
	Distance getDistance();

}
