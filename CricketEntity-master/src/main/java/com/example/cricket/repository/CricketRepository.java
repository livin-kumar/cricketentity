package com.example.cricket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cricket.entity.CricketEntity;


@Repository
public interface CricketRepository extends CrudRepository<CricketEntity, Long>{
	
	
	@Query("SELECT e FROM CricketEntity e Where e.runs >= 10000")
	public List<CricketEntity> getPlayerGreaterThan10K();
	
}
