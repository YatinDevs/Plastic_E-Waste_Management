package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Request;
import com.project.repository.RequestDao;


@Service
public class RequestServiceImple implements RequestService {
	
	@Autowired
	private RequestDao requestDao;

	@Override
	public List<Request> getRequestByEmail(String email) {
		return requestDao.getByEmail(email);
	}

	@Override
	public List<Request> getRequestById(int reqid) {
		return requestDao.getByReqid(reqid);
	}
	
	
}
