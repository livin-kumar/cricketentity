package com.example.cricket.service;

import java.util.List;
import java.util.Optional;

import com.example.cricket.entity.CricketEntity;

public interface CricketService {

//	CricketEntity insert(CricketEntity cricketEntity);
//	
//	List<CricketEntity> getAllPlayers();
	
	CricketEntity save(CricketEntity cricketEntity);
	
	List<CricketEntity> getmembers();
	
	CricketEntity getById(Long id);
	
	CricketEntity updatePlayer(Long id,CricketEntity cricketEntity);
	
	String deletePlayer(Long id);

	List<CricketEntity> getPlayerGrtrThan10K();
}
