package com.arvin.spring.recipeapp.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.arvin.spring.recipeapp.spring.Model.UoM;
@Service
public interface UoMRepository extends CrudRepository<UoM , Long> {
	
	Optional<UoM> findbyId(long id);

}
