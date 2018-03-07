package com.roadassistance.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.entity.Problem;

public interface ProblemRepository extends CrudRepository<Problem, Long> {
	@Query("{ location : { $nearSphere : [ ?1, ?0 ], $maxDistance: ?2 } }")
	public Iterable<GetProblemsByFilter> findProblemsByFilter(double lat, double lng, double radius,
			boolean[] problemTypes);
	
}
