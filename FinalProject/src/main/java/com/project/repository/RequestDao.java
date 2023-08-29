package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Request;

@Repository
public interface RequestDao extends JpaRepository<Request, Integer> {
	
	//Siddhesh
	public List<Request> getByReqid(int reqid);
	
	
	public List<Request> getByEmail(String email);
	
}
