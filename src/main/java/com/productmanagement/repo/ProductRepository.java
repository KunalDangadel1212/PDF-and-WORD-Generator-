package com.productmanagement.repo;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

import com.productmanagement.entity.Entity1;

public interface ProductRepository extends CrudRepository<Entity1 , Integer>{

}
