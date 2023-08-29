package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Request;
import com.project.service.RequestService;


@RestController
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	
	@GetMapping("/getuserbyemail")
	public List<Request> getRequestByEmail(@RequestBody Request request){
		return requestService.getRequestByEmail(request.getEmail());
	}
	
	@GetMapping("/getuserbyid")
	public List<Request> getRequestById(@RequestBody Request request){
		return requestService.getRequestById(request.getReqid());
	}
}
