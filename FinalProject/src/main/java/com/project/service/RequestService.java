package com.project.service;

import java.util.List;

import com.project.entity.Request;

public interface RequestService {
	
	
	
	//Yogita
//	public Request insertRequests(Request request);
//	public Request updateRequests(Request request);
	
	
	
	
	
	//Girish
//	public Request deleteRequest(Request request);
	
	//Shivani
	public List<Request> getRequestByEmail(String email);
	
	//Siddhesh
	public List<Request> getRequestById(int reqid);
}
