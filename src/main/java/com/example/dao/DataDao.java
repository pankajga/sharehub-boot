package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.ShareHub;

public interface DataDao extends CrudRepository<ShareHub, String> {
	
	public Iterable<ShareHub> findAll();

}
