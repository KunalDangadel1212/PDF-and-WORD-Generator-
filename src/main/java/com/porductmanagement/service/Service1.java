package com.porductmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.entity.Entity1;
import com.productmanagement.repo.ProductRepository;

@Service
public class Service1 {

	@Autowired
	ProductRepository productRepo;

	public List<Entity1> getEntity1s() {
		
		return (List<Entity1>) productRepo.findAll();
	}

	
}

