package com.arvin.spring.recipapp.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.arvin.spring.recipapp.spring.Model.Recipe;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe , Long> {
	

}
