package com.arvin.spring.recipeapp.spring.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.arvin.spring.recipeapp.spring.Model.Catagory;

public interface CatagoryRepository extends CrudRepository<Catagory , Long>{
	
	Optional<Catagory> findbyId(long id);

}
