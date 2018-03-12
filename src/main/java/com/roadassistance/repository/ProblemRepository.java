package com.roadassistance.repository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.roadassistance.api.dto.GetProblemsByFilter;
import com.roadassistance.entity.Problem;

public interface ProblemRepository extends CrudRepository<Problem, Long> {

}
