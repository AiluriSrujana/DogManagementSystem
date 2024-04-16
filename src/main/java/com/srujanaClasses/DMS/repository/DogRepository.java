package com.srujanaClasses.DMS.repository;
import java.util.List;
/*
/*

 * @ author Ailuri Srujana
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.srujanaClasses.DMS.Models.Dog;
@Repository
public interface DogRepository extends CrudRepository<Dog,Integer> {

	List<Dog> findByName(String name);
} 
