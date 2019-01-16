package com.project.springbootneo4j.repository;


import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.project.springbootneo4j.model.Distance;
import com.project.springbootneo4j.model.Node;
import com.project.springbootneo4j.model.Stop;

public interface StopRepository extends Neo4jRepository<Stop , Long> {

	@Query("MATCH (Depart:Stop {name:{0}}), (Destination:Stop {name:{1}})\r\n" + 
		   "MATCH p = shortestPath((Depart)-[:ARRET_A*]-(Destination))\r\n" + 
		   "RETURN p")
	Node[] getAllStops( String depart,  String destination);
	
	@Query("MATCH (a:Stop {name:':depart'})-[d:suivant]->(b:Stop {name:':destin'}) RETURN d")
	Distance getDistance();

}
