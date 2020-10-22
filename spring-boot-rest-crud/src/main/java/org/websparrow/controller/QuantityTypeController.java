package org.websparrow.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Category;
import org.websparrow.entity.PACK;
import org.websparrow.repository.CategoryRepository;
import org.websparrow.repository.PACKRepository;
import org.websparrow.entity.QuantityType;
import org.websparrow.repository.QuantityTypeRepository;


@RestController
@RequestMapping("/QuantityType")

public class QuantityTypeController {
	
	
	
	@Autowired
	QuantityTypeRepository   quantitytypekRepository;

	// insert new category into database
	@PostMapping("/add")
	public QuantityType addQuantityType(@RequestBody QuantityType quantitytype) {

		return quantitytypekRepository.save(quantitytype);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<QuantityType> allQuantityType() {

		return quantitytypekRepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{PackId}")
	public Optional<QuantityType> PackIdById(@PathVariable("typeid") int typeid) {

		return quantitytypekRepository.findById(typeid);
	}

	// update existing category
	@PutMapping("/update")
	public QuantityType updateQuantityType(@RequestBody QuantityType quantitytype) {

		return quantitytypekRepository.save(quantitytype);
	}

	// delete category from database
	@DeleteMapping("/{PackId}")
	public void deleteCategory(@PathVariable(" typeid") int  typeid) {

		quantitytypekRepository.deleteById( typeid);
	}


}
