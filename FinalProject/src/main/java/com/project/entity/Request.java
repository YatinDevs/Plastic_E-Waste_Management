package com.project.entity;


import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reqid;
	private String name;
	private String email;
	private String address;
	private int plasticQty;
	private int ewasteQty;
	private byte[] wasteImg;
	private String document;
	private byte[] docImg;
	private boolean status =false;
	public int getReqid() {
		return reqid;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPlasticQty() {
		return plasticQty;
	}
	public void setPlasticQty(int plasticQty) {
		this.plasticQty = plasticQty;
	}
	public int getEwasteQty() {
		return ewasteQty;
	}
	public void setEwasteQty(int ewasteQty) {
		this.ewasteQty = ewasteQty;
	}
	public byte[] getWasteImg() {
		return wasteImg;
	}
	public void setWasteImg(byte[] wasteImg) {
		this.wasteImg = wasteImg;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public byte[] getDocImg() {
		return docImg;
	}
	public void setDocImg(byte[] docImg) {
		this.docImg = docImg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Request [reqid=" + reqid + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", plasticQty=" + plasticQty + ", ewasteQty=" + ewasteQty + ", wasteImg=" + Arrays.toString(wasteImg)
				+ ", document=" + document + ", docImg=" + Arrays.toString(docImg) + ", status=" + status + "]";
	}
	
	
	

   
	
}
