package com.arvin.spring.recipapp.spring.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arvin.spring.recipapp.spring.Model.Catagory;
import com.arvin.spring.recipapp.spring.repository.CatagoryRepository;

@Controller
public class QueryController {

	/* private final UoMRepository UoMRepo; */
	
	private CatagoryRepository catagoryRepository;
    public QueryController(CatagoryRepository catagoryRepository) {
	 	 this.catagoryRepository = catagoryRepository;
	 }
	
	@RequestMapping({"","/"})
	public String Uom()
	{
		/*
		 * Optional<UoM> UoM = UoMRepo.findById(1L);
		 * System.out.println("UOM >>>>>:"+UoM.get().getUoM());
		 */
	  Optional<Catagory> Cat = catagoryRepository.findById(1L);
	  System.out.println("Catagory >>>>>:"+Cat.get().getDescription());
	  return "test";
	}
	
} 
