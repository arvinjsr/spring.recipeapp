package com.arvin.spring.recipapp.spring.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.arvin.spring.recipapp.spring.Model.Catagory;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepository extends CrudRepository<Catagory , Long>{
	//Not required as parent CrudRepository already defines this method
// and this repository inherits it
//	Optional<Catagory> findById(Long id);

}
