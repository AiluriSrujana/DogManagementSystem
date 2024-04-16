package com.srujanaClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.srujanaClasses.DMS.Models.Trainer;
/*
 * @author:Srujana ailuri
 */
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
