package com.arvin.spring.recipapp.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.arvin.spring.recipapp.spring.Model.UoM;
@Repository
public interface UoMRepository extends CrudRepository<UoM , Long> {
	
//Not required as parent CrudRepository already defines this method
// and this repository inherits it
//	Optional<UoM> findById(long id);

}
