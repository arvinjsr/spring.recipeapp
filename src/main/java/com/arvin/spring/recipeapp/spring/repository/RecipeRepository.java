package com.arvin.spring.recipeapp.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.arvin.spring.recipeapp.spring.Model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe , Long> {
	

}
