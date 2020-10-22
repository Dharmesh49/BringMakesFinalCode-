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
import org.websparrow.entity.STOCK;
import org.websparrow.entity.subcategory;
import org.websparrow.repository.STOCKRepository;
import org.websparrow.repository.subcategoryRepository;

@RestController
@RequestMapping("/SubCategory")

public class subcategoryController {
	
	@Autowired
	subcategoryRepository subCategoryRepository;

	// insert new category into database
	@PostMapping("/add")
	public subcategory addsubcatgeory(@RequestBody subcategory subCategory) {

		return subCategoryRepository.save(subCategory);
	}

	// fetch all category list from database
	@GetMapping("/all")
	public Iterable<subcategory> allsubcategory() {

		return subCategoryRepository.findAll();
	}

	// fetch specific category by their ID
	@GetMapping("/{subcategoryId}")
	public Optional<subcategory> subcategoryById(@PathVariable("subcategoryId") int subcategoryId) {

		return subCategoryRepository.findById(subcategoryId);
	}

	// update existing category
	@PutMapping("/update")
	public subcategory updatesubcategory(@RequestBody subcategory subCategory) {

		return subCategoryRepository.save(subCategory);
	}
	
	@PutMapping("/delete")
	public subcategory deletesubcategory(@RequestBody subcategory subCategory) {
		return subCategoryRepository.save(subCategory);
		       
		
	}

	// delete category from database
	@DeleteMapping("/{subcategoryId}")
	public void deleteSTOCK(@PathVariable("subcategoryId") int subcategoryId) {

		subCategoryRepository.deleteById(subcategoryId);
	}



}
