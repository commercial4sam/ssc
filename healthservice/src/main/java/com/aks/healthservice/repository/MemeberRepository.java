package com.aks.healthservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aks.healthservice.entity.Memberenrollment;

@Repository
public interface MemeberRepository extends CrudRepository<Memberenrollment,Long> {

	public Stream<Memberenrollment> findFirstByLastName();
	
}
